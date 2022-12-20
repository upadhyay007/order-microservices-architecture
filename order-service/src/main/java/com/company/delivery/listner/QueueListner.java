package com.company.delivery.listner;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.company.delivery.model.Order;

@Service
public class QueueListner {
	@RabbitListener(queues = "OrderPleaced")
	public void messageFromQueue(byte[] message) throws IOException, ClassNotFoundException {

		ByteArrayInputStream bis = new ByteArrayInputStream(message);

		ObjectInput in = new ObjectInputStream(bis);
		Order order = (Order) in.readObject();
		System.out.println("Message read from queue..." + order.toString());
		in.close();
		in.close();
	}

}
