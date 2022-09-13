import { createContext, useEffect, useState, useContext } from "react";
import axios from "axios";

const WeatherContext = createContext();

export const WeatherProvider = function ({ children }) {
  const [location, setLocation] = useState("Istanbul");
  const [data, setData] = useState({});
  const cities = [
    "Adana",
    "Afyon",
    "Amasya",
    "Ankara",
    "Antalya",
    "Artvin",
    "Bilecik",
    "Bingöl",
    "Bitlis",
    "Bolu",
    "Burdur",
    "Bursa",
    "Çorum",
    "Denizli",
    "Edirne",
    "Erzincan",
    "Erzurum",
    "Gaziantep",
    "Giresun",
    "Hakkari",
    "Hatay",
    "Isparta",
    "Mersin",
    "İstanbul",
    "İzmir",
    "Kars",
    "Kastamonu",
    "Kayseri",
    "Kırklareli",
    "Kırşehir",
    "Kocaeli",
    "Konya",
    "Kütahya",
    "Malatya",
    "Manisa",
    "Kahramanmaraş",
    "Mardin",
    "Muğla",
    "Muş",
    "Nevşehir",
    "Niğde",
    "Ordu",
    "Rize",
    "Sakarya",
    "Samsun",
    "Siirt",
    "Sinop",
    "Sivas",
    "Tekirdağ",
    "Tokat",
    "Trabzon",
    "Tunceli",
    "Şanlıurfa",
    "Uşak",
    "Van",
    "Yozgat",
    "Zonguldak",
    "Aksaray",
    "Bayburt",
    "Karaman",
    "Kırıkkale",
    "Batman",
    "Şırnak",
    "Bartın",
    "Ardahan",
    "Iğdır",
    "Yalova",
    "Karabük",
    "Kilis",
    "Osmaniye",
    "Düzce",
    "Beyşehir",
    "Cihanbeyli",
  ];

  useEffect(() => {
    async function fetchData() {
      await axios(
        `https://api.weatherbit.io/v2.0/forecast/daily?city=${location},TR&key=03585eef0ab4452bad68f9cb49e25b3f`
      )
        .then((incoming) => setData(incoming.data))
        .catch((error) => console.log(error));
    }
    fetchData();
  }, [location]);
  const values = {
    location,
    setLocation,
    cities,
    data,
    setData,
  };
  if (JSON.stringify({}) !== JSON.stringify(data)) {
    return (
      <WeatherContext.Provider value={values}>
        {children}
      </WeatherContext.Provider>
    );
  }
};
export const useWeather = () => useContext(WeatherContext);
