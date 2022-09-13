import Card from "react-bootstrap/Card";
import ListGroup from "react-bootstrap/ListGroup";

function WeatherCard({ day }) {
  const weekday = ["Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"];
  const date = new Date(day.datetime).getDay();
  return (
    <Card style={{ fontFamily: "monospace", fontSize: "12px" }}>
      <Card.Img
        variant="top"
        src={`https://www.weatherbit.io/static/img/icons/${day.weather.icon}.png`}
      />
      <Card.Body>
        <Card.Title>{weekday[date]}</Card.Title>
        <Card.Text>{day.weather.description}</Card.Text>
      </Card.Body>
      <ListGroup className="list-group-flush">
        <ListGroup.Item>{`Temp: ${Math.round(day.temp)}°C`} </ListGroup.Item>
        <ListGroup.Item>{`Precipitation: ${Math.round(
          day.precip * 100
        )}%`}</ListGroup.Item>
        <ListGroup.Item>{`Wind Speed: ${Math.round(
          day.wind_spd
        )}km/h`}</ListGroup.Item>
      </ListGroup>
    </Card>
  );
}

export default WeatherCard;
