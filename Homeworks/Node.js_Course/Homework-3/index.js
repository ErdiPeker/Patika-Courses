const { circleArea, circleCircumference } = require("./circle");

console.log(
  `Yarıçapı 5 mm olan dairenin kenar uzunluğu ${circleCircumference(5).toFixed(
    2
  )} mm'dir. Ayrıca alanı da ${circleArea(5).toFixed(2)} mm2'dir.`
);
