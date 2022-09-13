import Container from "react-bootstrap/Container";
import Row from "react-bootstrap/Row";
import Col from "react-bootstrap/Col";
import { useWeather } from "../contexts/WeatherContext";

function Navbar() {
  const { location, cities, setLocation } = useWeather();

  return (
    <Container style={{ backgroundColor: "aliceblue", height: "50px" }}>
      <Row>
        <Col style={{ fontFamily: "monospace", fontSize: "35px" }}>
          Weather App
        </Col>
        <Col>
          <div
            style={{
              fontFamily: "monospace",
              fontSize: "25px",
              margin: "5px",
            }}
          >
            <select
              defaultValue={location}
              onChange={(e) => setLocation(e.target.value)}
              name="city"
            >
              {cities.map((item, index) => (
                <option value={item} key={index}>
                  {item}
                </option>
              ))}
            </select>
          </div>
        </Col>
      </Row>
    </Container>
  );
}

export default Navbar;
