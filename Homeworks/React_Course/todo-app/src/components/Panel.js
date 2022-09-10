import React from "react";

function Panel({ list }) {
  return (
    <div className="panel">
      <div>{list.length} items left</div>
      <div>
        <button>All</button>
        <button>Active</button>
        <button>Completed</button>
      </div>
      <div>Clear completed</div>
    </div>
  );
}

export default Panel;
