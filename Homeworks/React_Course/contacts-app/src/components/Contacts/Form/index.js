import { useState } from "react";

function Form({ contacts, addContact }) {
  const [form, setForm] = useState({
    fullname: "",
    phoneNumber: "",
  });

  const onChange = (event) => {
    setForm({ ...form, [event.target.name]: event.target.value });
  };

  const onSubmit = (event) => {
    event.preventDefault();
    if (form.fullname === "" || form.phoneNumber === "") {
      return false;
    }
    addContact([...contacts, form]);
    setForm({
      fullname: "",
      phoneNumber: "",
    });
  };

  return (
    <form onSubmit={onSubmit}>
      <div>
        <input
          name="fullname"
          placeholder="Full Name"
          onChange={onChange}
          value={form.fullname}
        />
      </div>

      <div>
        <input
          name="phoneNumber"
          placeholder="Phone Number"
          onChange={onChange}
          value={form.phoneNumber}
        />
      </div>
      <div className="btn">
        <button>Add</button>
      </div>
    </form>
  );
}

export default Form;
