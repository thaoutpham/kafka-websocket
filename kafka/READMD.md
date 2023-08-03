#Setup environment:
- Download file: https://dlcdn.apache.org/kafka/3.5.0/kafka_2.13-3.5.0.tgz  (Hoặc vào đây https://kafka.apache.org/quickstart)
- Giải nén

#Run:
- cd kafka_2.13-3.5.0
- Start the ZooKeeper service (open new terminal tab):
  $ bin/zookeeper-server-start.sh config/zookeeper.properties
- Start the Kafka broker service (open new terminal tab):
  $ bin/kafka-server-start.sh config/server.properties
- Write some events into the topic(open new terminal tab):
  $ bin/kafka-console-consumer.sh --topic amigoscode --from-beginning --bootstrap-server localhost:9092    
  (amigoscode in amigoscodeTopic(class KafkaTopicConfig))
  
#Lưu ý:
- Để có thế truyền mọi class thì config Kafka Listener với data truyền
vào là String(convert class thành String qua ObjectMapper)