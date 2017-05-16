package kafka;

public interface KafkaConfigInterface {
	final static String zookeeperConnect = "localhost:2181";
	final static String kafkaUrl = "localhost";
	final static int kafkaPort = 9092;
	final static int replication = 1;
	final static String groupId = "myGroup";
	final static String topic = "topic";
	final static String topic2 = "topic2";
	final static String topic3 = "topic3";
	final static int connectionTimeOut = 20000;
	final static int reconnectInterval = 10000;
	final static int kafkaProducerBufferSize = 64*1024;
	final static String clientId = "SimpleConsumerDemoClient";
	
}
