import React from "react";
import { FaCheck, FaCrosshairs } from "react-icons/fa";

function ListLine({ item, setList, list }) {
  const doneLine = (event) => {
    const newList = [...list];
    newList.map((it) => {
      if (it.todo == event.target.dataset.name) {
        it.isDone = !it.isDone;
      }
    });
    setList(newList);
  };
  const deleteLine = (event) => {
    setList(list.filter((it) => it.todo !== event.target.dataset.name));
    console.log(list, event.target.dataset.name);
  };
  return (
    <li>
      <div className="line">
        <div className="circle" onClick={doneLine} data-name={item.todo}>
          {item.isDone && <FaCheck data-name={item.todo} />}
        </div>
        <div>{item.todo}</div>
      </div>
      <div onClick={deleteLine} data-name={item.todo}>
        <FaCrosshairs data-name={item.todo} />
      </div>
    </li>
  );
}

export default ListLine;
