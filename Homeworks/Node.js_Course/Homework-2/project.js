const blogs = [
  { id: 1, author: "yazar-1", content: "1.lorem ipsum dolor sit amet." },
  { id: 2, author: "yazar-2", content: "2.lorem ipsum dolor sit amet." },
  { id: 3, author: "yazar-3", content: "3.lorem ipsum dolor sit amet." },
];

const printContents = (posts) => {
  posts.map((post) => {
    console.log(post.content);
  });
};
printContents(blogs);

const addPost = async function (newPost) {
  return new Promise((resolve, reject) => {
    if (newPost) {
      console.log("A new post is adding...");
      const newBlogs = [...blogs];
      newBlogs.push(newPost);
      resolve(newBlogs);
    } else {
      reject("Nothing to add");
    }
  });
};
// addPost({
//   id: 3,
//   author: "yazar-3",
//   content: "4.lorem ipsum dolor sit amet.",
// })
//   .then((data) => {
//     printContents(data);
//   })
//   .catch((err) => console.log(err));

(async () => {
  const newBlog = await addPost({
    id: 3,
    author: "yazar-3",
    content: "4.lorem ipsum dolor sit amet.",
  });
  printContents(newBlog);
})();
