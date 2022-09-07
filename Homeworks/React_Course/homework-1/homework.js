import axios from "axios";
export default async (user_id) => {
  let { data: user } = await axios(
    `https://jsonplaceholder.typicode.com/users/${user_id}`
  );
  const { data: post } = await axios(
    `https://jsonplaceholder.typicode.com/posts?userId=${user_id}`
  );

  user.posts = post;
  return user;
};
