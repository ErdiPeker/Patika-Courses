import Container from "react-bootstrap/Container";
import Row from "react-bootstrap/Row";
import Col from "react-bootstrap/Col";
import WeatherCard from "./WeatherCard";
import { useWeather } from "../contexts/WeatherContext";

function WeatherLine() {
  const { data } = useWeather();
  const weeklyData = data.data.filter((k, i) => i < 7);
  return (
    <Container>
      <Row>
        {weeklyData.map((day, index) => {
          return (
            <Col key={index}>
              <WeatherCard day={day} />
            </Col>
          );
        })}
      </Row>
    </Container>
  );
}

export default WeatherLine;
