package kafka;

public class MainTest {

	public static void main(String[] args) {
        KafkaProducer producerThread = new KafkaProducer(KafkaConfigInterface.topic);
        producerThread.start();
        KafkaConsumer consumerThread = new KafkaConsumer(KafkaConfigInterface.topic);
        consumerThread.start();
    }

}
