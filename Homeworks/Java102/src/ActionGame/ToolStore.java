package ActionGame;

public class ToolStore extends NormalLoc{
    public ToolStore(Player player) {
        super(player, "Tool Store");
    }

    @Override
    public boolean onLocation() {
        System.out.println("--------  Welcome to Tool Store !  --------");
        System.out.println("1-Weapons");
        System.out.println("2-Armors");
        System.out.println("3-Leave");
        System.out.print("Choose! : ");
        int selectCase = Location.input.nextInt();
        while(selectCase<1 || selectCase>3){
            System.out.println("Try Again!");
            selectCase = Location.input.nextInt();
        }
        switch (selectCase){
            case 1:
                printWeapon();
                buyWeapon();
                break;
            case 2:
                printArmor();
                buyArmor();
                break;
            case 3:
                System.out.println("Please come again in future!");
                return true;

        }
        return true;
    }

    public void printWeapon(){
        System.out.println("-----------  Weapons  -----------");
        for(Weapon weapon:Weapon.weapons()){
            System.out.println(weapon.getId() + "-" + weapon.getName() +
                    " < Price : " +weapon.getPrice() +
                    " , Damage : "+ weapon.getDamage() +" >");
        }


    }
    public void buyWeapon(){
        System.out.println("Choose:");

        int selectWeaponID= Location.input.nextInt();
        while(selectWeaponID<1 || selectWeaponID>Weapon.weapons().length){
            System.out.println("Try Again!");
            selectWeaponID = Location.input.nextInt();
        }

        Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeaponID);

        if(selectedWeapon!=null){
            if(selectedWeapon.getPrice()>this.getPlayer().getCharacter().getMoney()){
                System.out.println("You dont have enough money!");
            }else{
                System.out.println(selectedWeapon.getName() + " has been bought !");
                int balance = this.getPlayer().getCharacter().getMoney()-selectedWeapon.getPrice();
                this.getPlayer().getCharacter().setMoney(balance);
                System.out.println("Balance after payment : " + this.getPlayer().getCharacter().getMoney());
                this.getPlayer().getInventory().setWeapon(selectedWeapon);

            }
        }
    }
    public void printArmor(){
        System.out.println("-----------  Armors  -----------");
        for(Armor armor:Armor.armors()){
            System.out.println(armor.getId() + "-" + armor.getName() +
                    " < Price : " +armor.getPrice() +
                    " , Block : "+ armor.getBlock() +" >");
        }
    }

    public void buyArmor(){
        System.out.println("Choose:");

        int selectArmorID= Location.input.nextInt();
        while(selectArmorID<1 || selectArmorID>Armor.armors().length){
            System.out.println("Try Again!");
            selectArmorID = Location.input.nextInt();
        }

        Armor selectedArmor = Armor.getArmorObjByID(selectArmorID);

        if(selectedArmor!=null){
            if(selectedArmor.getPrice()>this.getPlayer().getCharacter().getMoney()){
                System.out.println("You don't have enough money!");
            }else{
                System.out.println(selectedArmor.getName() + " has been bought !");
                int balance = this.getPlayer().getCharacter().getMoney()-selectedArmor.getPrice();
                this.getPlayer().getCharacter().setMoney(balance);
                System.out.println("Balance after payment : " + this.getPlayer().getCharacter().getMoney());
                this.getPlayer().getInventory().setArmor(selectedArmor);

            }
        }
    }
}
