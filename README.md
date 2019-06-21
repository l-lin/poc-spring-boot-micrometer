# Example using Spring Boot with Micrometer, Prometheus and Grafana

> Sample project to monitor app performance using micrometer, prometheus and grafana.

## Getting started
### Prerequisites

- Java 8+
- Maven
- Docker
- Docker compose

### Build & launch

```bash
make

# Application is deployed in port 8080
curl -i https://localhost:8080/actuator/health
# Add a new cat
curl -X POST http://localhost:8080/cats -d '{"name": "Tony"}'
# Fetch all cats
curl http://localhost:8080/cats -H "Accept: application/json"
# Fetch one cat in particular
curl http://localhost:8080/cats/1 -H "Accept: application/json"
# Find all custom queries
curl http://localhost:8080/cats/search -H "Accept: application/json"
# Find cats by their name
curl http://localhost:8080/cats/search/findByName?name=Tony -H "Accept: application/json"

# Grafana is deployed in port 3000, you can check the stats provided by prometheus from micrometer
firefox http://localhost:3000

# Find "slow" queries
docker exec -it spring-boot-micrometer_db_1 psql -U postgres sample -c "SELECT query, calls, total_time, min_time, max_time, mean_time FROM pg_stat_statements ORDER BY mean_time DESC"
```
