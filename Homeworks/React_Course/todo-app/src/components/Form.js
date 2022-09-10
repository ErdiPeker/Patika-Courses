import { useState } from "react";

function Form({ list, addList }) {
  const [addition, setAddition] = useState("");

  const onChange = (event) => {
    setAddition(event.target.value);
  };
  const onSubmit = (event) => {
    event.preventDefault();
    const newAddition = { todo: addition, isDone: false };
    addList([...list, newAddition]);
    setAddition("");
  };
  return (
    <form onSubmit={onSubmit}>
      <input onChange={onChange} value={addition} placeholder="Add to List" />
    </form>
  );
}

export default Form;
