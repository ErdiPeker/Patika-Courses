import { useState } from "react";

function List({ contacts }) {
  const [keyword, setKeyword] = useState("");

  const filtered = contacts.filter((item) => {
    return Object.keys(item).some((key) => {
      return item[key].toString().toLowerCase().includes(keyword.toLowerCase());
    });
  });

  return (
    <div>
      <h1>Contacts List App</h1>
      <input
        name="keyword"
        value={keyword}
        placeholder="Filter Contact"
        onChange={(e) => {
          setKeyword(e.target.value);
        }}
      />
      <ul className="list">
        {filtered &&
          filtered.map((contact, index) => {
            return (
              <li key={index}>
                <span>{contact.fullname}</span>
                <span>{contact.phoneNumber}</span>
              </li>
            );
          })}
        <p>Total Contacts ({filtered.length})</p>
      </ul>
    </div>
  );
}

export default List;
