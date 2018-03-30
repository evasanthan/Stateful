package ionic.MsmqJava;

import ionic.Msmq.Queue;
import ionic.Msmq.Message;
import ionic.Msmq.TransactionType;
import ionic.Msmq.MessageQueueException;

public class TestClient {
    Queue queue = null;

    String ipAddr = " [ip:?]";

    public TestClient() {
        try {
            java.net.InetAddress thisIp = java.net.InetAddress.getLocalHost();
            ipAddr = " [ip:" + thisIp.getHostAddress() + "]";
        } catch (Exception ex1) {
        }
    }


    public static void main(String[] args) throws java.lang.Exception {
        TestClient c = new TestClient();
        c.Run();
    }
}