import com.rabbitmq.client.*;

import java.io.IOException;

public class Application {

    private final static String QUEUE_NAME = "hello";

    public static void main(String[] argv) throws Exception {
        Recv.receive();
        Sender.sendHello();
        Sender.sendHello();
    }
    }