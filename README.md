# AI Gateway Platform

[![CI](https://github.com/lppduy/ai-gateway-platform/actions/workflows/ci.yml/badge.svg)](https://github.com/lppduy/ai-gateway-platform/actions/workflows/ci.yml)

> Cost-effective AI Gateway with multi-tenancy, rate limiting, and provider fallback

## Quick Start

### Local Development
```bash
# Run application
./mvnw spring-boot:run

# Test health endpoint
curl http://localhost:8080/actuator/health
```

### Docker
```bash
# Build and run with Docker
docker-compose up -d

# View logs
docker-compose logs -f

# Stop
docker-compose down
```

## Tech Stack

- Java 17 + Spring Boot 3.5 (WebFlux)
- Resilience4j (circuit breaker, rate limiter, retry)
- Swagger/OpenAPI (auto-generated docs)
- Docker + Docker Compose

## Roadmap

- [x] Foundation learning
- [ ] Week 1: Core proxy functionality
- [ ] Week 2: Rate limiting + Circuit breaker  
- [ ] Week 3: Multi-tenancy + Cost tracking
- [ ] Week 4: Testing + Deployment

## Features (Planned)

- ✨ Multi-provider routing (OpenAI, Anthropic, Google)
- 🚦 Token-based rate limiting
- 🔌 Circuit breaker & fallback
- 💰 Cost tracking & analytics
- 🏢 Multi-tenant isolation

## Development

```bash
# Clone repo
git clone <repo>
cd ai-gateway-platform

# Start dependencies
docker-compose up -d

# Build and run
./mvnw clean install
./mvnw spring-boot:run
```

## Environment Variables

```bash
# Create .env file
OPENAI_API_KEY=your-openai-key
ANTHROPIC_API_KEY=your-anthropic-key
```

## API Documentation

Once running, visit:
- Health: http://localhost:8080/actuator/health
- Metrics: http://localhost:8080/actuator/metrics
- Swagger UI: http://localhost:8080/swagger-ui.html
- OpenAPI JSON: http://localhost:8080/v3/api-docs

## License

MIT
