const Koa = require("koa");
const app = new Koa();

// response
app.use((ctx) => {
  const url = ctx.request.url;
  console.log(ctx);
  if (url === "/") {
    ctx.body = "<h1>Başlangıç sayfasına hoşgeldiniz</h1>";
  } else if (url === "/hakkimda") {
    ctx.body = "<h1>Hakkımda sayfasına hoşgeldiniz</h1>";
  } else if (url === "/iletisim") {
    ctx.body = "<h1>İletişim sayfasına hoşgeldiniz</h1>";
  } else {
    ctx.response.status = 404;
    ctx.body = "<h1>404-Sayfa bulunamadı</h1>";
  }
});

app.listen(3000);
