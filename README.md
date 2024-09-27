
# SMS Producer API
This is the **Producer Service**, a Spring Boot application that produces messages (e.g., SMS notifications) and sends them to a Kafka topic.

## Features
- Kafka Producer setup for sending messages to a specific topic.
- Exposes API endpoints to send messages based on a key-value structure.
- Simple configuration for Kafka integration in Spring Boot.


# SMS Consumer API

This is the initial setup for the **Sms-consumer-api**, a Spring Boot application that consumes SMS messages from a Kafka topic.

## Features
- Kafka Consumer setup to consume messages from a specified Kafka topic.
- API endpoints to test Kafka consumption.
- Basic configuration for Kafka integration in Spring Boot.

## Usage

### Example cURL Request to Send a Message

curl --location 'http://localhost:8085/send' \
--header 'Content-Type: application/json' \
--data '{
    "key":"Test1",
    "message":"Test message "
}'
