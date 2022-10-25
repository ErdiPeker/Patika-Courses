let listDOM = document.querySelector("#list");
let taskList = localStorage.getItem("taskList")
  ? JSON.parse(localStorage.getItem("taskList"))
  : [
      [1000, "3 Litre Su İç", 0],
      [1001, "Ödevleri Yap", 0],
      [1002, "En Az 3 Saat Kodlama Yap", 0],
      [1003, "Yemek Yap", 0],
      [1004, "50 Sayfa Kitap Oku", 0],
    ];

const showTasks = function (taskList) {
  listDOM.innerHTML = "";
  taskList.forEach((task) => {
    let newLine = document.createElement("li");
    newLine.setAttribute("id", `${task[0]}`);
    newLine.classList.add("d-flex", "align-items-center");
    if (task[2]) {
      newLine.classList.add("bg-success");
    }

    newLine.innerHTML = `
    <p class="my-auto">${task[1]}</p>
    <button id="${task[0]}" onclick="doneTask(event)" class="btn btn-success ml-auto">
     Yapıldı
    </button>
    <button id="${task[0]}" onclick="deleteTask(event)" class="btn btn-danger ml-2">
     Sil  
    </button>
    `;
    listDOM.append(newLine);
  });
};

const addTask = function () {
  if (document.querySelector("#task").value.trim()) {
    task = [
      taskList[taskList.length - 1][0] + 1,
      document.querySelector("#task").value.trim(),
      0,
    ];
    taskList.push(task);
    showTasks(taskList);
    localStorage.setItem("taskList", JSON.stringify(taskList));
    $("#liveToastadded").toast("show");
    document.querySelector("#task").value = "";
  } else {
    $("#liveToast").toast("show");
  }
};

const deleteTask = function (event) {
  taskList = taskList.filter(
    (item) => item[0] !== Number(event.currentTarget.id)
  );
  showTasks(taskList);
  localStorage.setItem("taskList", JSON.stringify(taskList));
};

const doneTask = function (event) {
  taskList.forEach((item) => {
    if (item[0] === Number(event.currentTarget.id)) {
      item[2] = 1;
    }
  });
  showTasks(taskList);
  localStorage.setItem("taskList", JSON.stringify(taskList));
};
showTasks(taskList);
localStorage.setItem("taskList", JSON.stringify(taskList));
