import Navbar from "./components/Navbar";
import WeatherLine from "./components/WeatherLine";

import { WeatherProvider } from "./contexts/WeatherContext";
import "./App.css";
import "bootstrap/dist/css/bootstrap.min.css";

function App() {
  return (
    <WeatherProvider>
      <div className="App">
        <Navbar />
        <WeatherLine />
      </div>
    </WeatherProvider>
  );
}

export default App;
