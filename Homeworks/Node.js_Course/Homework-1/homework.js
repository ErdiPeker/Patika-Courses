const argument = process.argv[2];

const calcArea = (r) => Math.PI * r ** 2;

console.log(
  `Yarıçapı ${argument} cm olan dairenin alanı: ${calcArea(argument)} cm2'dir.`
);
