package testData.JavaCodeAnalyserJMSTest;

import javax.jms.TopicConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.XATopicConnection;
import javax.jms.XATopicConnectionFactory;
import javax.naming.InitialContext;

public class TopicConnectionFactory {


    public void topicConnection_With_JNDI() throws Exception {
        InitialContext ctx = new InitialContext();

        QueueConnectionFactory cf = (QueueConnectionFactory) ctx
                .lookup("HTTPConnectionFactory");
        QueueConnection c = cf.createQueueConnection();
        c.close();

        XATopicConnectionFactory xacf = (XATopicConnectionFactory) ctx
                .lookup("HTTPXAConnectionFactory");
        XATopicConnection xac = xacf.createXATopicConnection();
        xac.close();
    }

    public void topicConnection_Without_JNDI() throws Exception {

        Properties props = new Properties();

        QueueConnectionFactory cf = new SpyConnectionFactory(props);
        QueueConnection c = cf.createQueueConnection();
        c.close();

        XATopicConnectionFactory xacf = new SpyXAConnectionFactory(props);
        XATopicConnection xac = xacf.createXATopicConnection();
        xac.close();
    }

}