package kafka;

import java.util.Properties;

import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;

public class KafkaProducer extends Thread {
	
	private final Producer<Integer,String> producer;
	private final Properties props = new Properties();
	private final String topic;
	
	public KafkaProducer(String topic){
		props.put("serializer.class", "kafka.serializer.StringEncoder");
		props.put("metadata.broker.list", "localhost:9092");
		producer = new Producer<Integer,String>(new ProducerConfig(props));
		this.topic = topic;
	}
	
	@Override
	public void run(){
		int messageNo = 1;
		while(true){
			String messageStr = "Message_"+messageNo;
			System.out.println("Send"+messageStr);
			producer.send(new KeyedMessage<Integer,String>(topic,messageStr));
			messageNo++;
			try {
				sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
