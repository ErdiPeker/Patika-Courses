const http = require("http");

const server = http.createServer((req, res) => {
  res.writeHead(200, { "Content-Type": "text/html" });
  console.log(req.url);
  if (req.url === "/") {
    res.write("<h2>Index sayfasina hosgeldiniz</h2>");
  } else if (req.url === "/hakkimda") {
    res.write("<h2>Hakkimda sayfasina hosgeldiniz</h2>");
  } else if (req.url === "/iletisim") {
    res.write("<h2>Iletisim sayfasina hosgeldiniz</h2>");
  } else {
    res.write("<h2>404 - Bir problem olustu.</h2>");
  }
  res.end();
});

const port = 5000;
server.listen(port, () => {
  console.log(`server ${port} portunda baslatildi`);
});
