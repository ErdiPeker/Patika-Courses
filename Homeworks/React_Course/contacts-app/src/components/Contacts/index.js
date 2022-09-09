import { useState, useEffect } from "react";
import List from "./List";
import Form from "./Form";
import "./style.css";

function Contacts() {
  const [contacts, setContacts] = useState([
    {
      fullname: "Mehmet",
      phoneNumber: "123113623",
    },
    {
      fullname: "Ahmet",
      phoneNumber: "123144365",
    },
    {
      fullname: "Cevat",
      phoneNumber: "12354723",
    },
  ]);

  useEffect(() => {
    console.log(contacts);
  }, [contacts]);

  return (
    <div id="contacts">
      <List contacts={contacts} />
      <Form contacts={contacts} addContact={setContacts} />
    </div>
  );
}

export default Contacts;
