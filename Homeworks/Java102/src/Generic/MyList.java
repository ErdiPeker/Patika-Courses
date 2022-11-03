package Generic;

public class MyList<T> {
    private T[] list;
    private int ind = 0;

    public MyList(int capacity) {
        this.list = (T[]) new Object[capacity];
    }

    public MyList() {
        this.list = (T[]) new Object[10];
    }


    public int size() {
        return ind;
    }

    public int getCapacity() {
        return list.length;
    }

    public void increaseCapacity() {
        T[] temp = (T[]) new Object[this.getCapacity() + 10];
        for (int i = 0; i < this.getCapacity(); i++) {
            temp[i] = this.list[i];
        }
        this.list = temp;
    }

    public void add(T data) {
        list[ind] = data;
        ind++;
        if (ind >= this.getCapacity()) {
            this.increaseCapacity();
        }
    }

    public T get(int i) {
        if (i >= 0 && i < this.getCapacity()) {
            return this.list[i];
        }
        return null;
    }

    public T[] remove(int index) {
        if (index >= 0 && index < this.getCapacity()) {
            for(int j=index;j<this.getCapacity()-1;j++){
                this.list[index]=this.list[index+1];
            }
            this.list[this.getCapacity()-1]=null;
            this.ind--;
            return this.list;
        }
        return null;
    }

    public T[] set(int index, T data){
        if (index >= 0 && index < this.getCapacity()){
            this.list[index]=data;
            return this.list;
        }
        return null;
    }
    public String toString(){
        String res="";
        for(int i=0;i<this.getCapacity();i++){
            if(this.list[i]!=null) {
                res += this.list[i].toString();
                if (i<this.getCapacity()-1){
                    res+=",";
                }
            }

        }
        return "["+res+"]";
    }

    public int indexOf(T data){
        for (int i=0;i<this.getCapacity();i++){
            if(this.list[i]==data){
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data){
        for (int i=this.getCapacity()-1;i>=0;i--){
            if(this.list[i]==data){
                return i;
            }
        }
        return -1;
    }
    public boolean isEmpty(){
        for (T data: this.list){
            if(data!=null){
                return false;
            }
        }
        return true;
    }
    public T[] toArray(){
        return this.list;
    }

    public void clear(){
        this.list=(T[])new Object[this.getCapacity()];
    }

    public MyList<T> subList(int b, int e){
        MyList<T> newList= new MyList<>(e-b+1);

        int j=0;
        for (int i=b;i<=e;i++){
            newList.list[j]=this.list[i];
            j++;
        }
        return newList;
    }

    public boolean contains(T data){
        for (T t: this.list){
            if(data==t){
                return true;
            }
        }
        return false;
    }
}
