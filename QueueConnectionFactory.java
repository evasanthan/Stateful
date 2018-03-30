package testData.JavaCodeAnalyserJMSTest;

import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.XAQueueConnection;
import javax.jms.XAQueueConnectionFactory;
import javax.naming.InitialContext;

public class QueueConnectionFactory {


    public void QueueConnection_WithJNDI() throws Exception {
        InitialContext ctx = new InitialContext();

        TopicConnectionFactory cf = (TopicConnectionFactory) ctx
                .lookup("HTTPConnectionFactory");
        TopicConnection c = cf.createTopicConnection();
        c.close();

        XATopicConnectionFactory xacf = (XATopicConnectionFactory) ctx
                .lookup("HTTPXAConnectionFactory");
        XATopicConnection xac = xacf.createXATopicConnection();
        xac.close();
    }

    public void QueueConnection_Without_JNDI() throws Exception {

        Properties props = new Properties();

        XATopicConnectionFactory cf = new SpyConnectionFactory(props);
        TopicConnection c = cf.createQueueConnection();
        c.close();

        XATopicConnectionFactory xacf = new SpyXAConnectionFactory(props);
        XATopicConnection xac = xacf.createXATopicConnection();
        xac.close();
    }

}