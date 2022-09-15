const Koa = require("koa");
const app = new Koa();
const port = 3000;
const Router = require("koa-router");
const router = new Router();
router.get("/", (ctx) => {
  ctx.status = 200;
  ctx.body = "<h1>Giriş sayfasına hoşgeldiniz</h1>";
});
router.get("/hakkimda", (ctx) => {
  ctx.status = 200;
  ctx.body = "<h1>Hakkımda sayfasına hoşgeldiniz</h1>";
});
router.get("/iletisim", (ctx) => {
  ctx.status = 200;
  ctx.body = "<h1>İletişim sayfasına hoşgeldiniz</h1>";
});
app.use(router.routes());
app.listen(port, () => {
  console.log(`Server ${port} portunda başlatıldı`);
});
