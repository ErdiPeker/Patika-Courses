const fs = require("fs");

fs.writeFile(
  "employees.json",
  '{ "name": "Employee 1 Name", "salary": "2000" }',
  (err, data) => {
    if (err) console.log(err);
    console.log("Json file is created");
  }
);

fs.appendFile(
  "./employees.json",
  '{ "name": "Employee 2 Name", "salary": "3000" }',
  (err) => {
    if (err) console.log(err);
    console.log("Json file is updated");
  }
);

setTimeout(() => {
  fs.readFile("./employees.json", "utf8", (err, data) => {
    if (err) console.log(err);
    console.log(data);
    console.log("Json file is read");
  });
}, 1000);
// fs.unlink("./employees.json", (err) => {
//   if (err) console.log(err);
//   console.log("Json file is deleted");
// });
