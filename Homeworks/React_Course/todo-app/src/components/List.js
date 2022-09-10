import ListLine from "./ListLine.js";
import Panel from "./Panel.js";

function List({ list, setList }) {
  return (
    <>
      <ul>
        {list &&
          list.map((item, index) => (
            <ListLine item={item} key={index} setList={setList} list={list} />
          ))}
      </ul>
      <Panel list={list} />
    </>
  );
}

export default List;
