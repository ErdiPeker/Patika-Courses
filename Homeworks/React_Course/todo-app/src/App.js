import "./App.css";
import List from "./components/List.js";
import Form from "./components/Form.js";
import Panel from "./components/Panel.js";
import { useState } from "react";

function App() {
  const [list, setList] = useState([
    {
      todo: "Wake up early",
      isDone: true,
    },
    {
      todo: "Brush teeth",
      isDone: false,
    },
    {
      todo: "Take a shower",
      isDone: false,
    },
  ]);

  return (
    <div className="App">
      <div className="container">
        <h1>To-Do App</h1>
        <Form list={list} addList={setList} />
        <List list={list} setList={setList} />
      </div>
    </div>
  );
}

export default App;
