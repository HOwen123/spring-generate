package rabbitMQ._4;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @author chenssy
 * @date 2017/8/3
 * @since v1.0.0
 */
public class Send {
    private final static String QUEUE_NAME = "helloWorld";
    
    public static void main(String[] args) throws IOException {
        // 创建连接
        ConnectionFactory factory = new ConnectionFactory();
        // 设置 RabbitMQ 的主机名
        factory.setHost("localhost");
        // 创建一个连接
        Connection connection = factory.newConnection();
        // 创建一个通道
        Channel channel = connection.createChannel();
        // 指定一个队列
        channel.queueDeclare(QUEUE_NAME, true, false, false, null);
        // 发送消息
        for (int i = 0; i < 50; i++) {
            String message = "chenssy:" + i;
            channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
            System.out.println(" [x] Sent '" + message + "'");

            if(i % 100 ==0){
                try {
                    TimeUnit.SECONDS.sleep(5L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        // 关闭频道和连接
        channel.close();
        connection.close();
    }
}
