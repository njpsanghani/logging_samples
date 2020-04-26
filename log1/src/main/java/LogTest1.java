import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class LogTest1 {

    private static final Logger logger = LogManager.getLogger(LogTest1.class);


    public static void main(String[] args) throws InterruptedException {

        for (;;) {

            logger.debug("Debug Message Logged NJSNJSNJS !!!");
            logger.info("Info Message Logged NJSNJSNJS!!!");
            logger.error("Error Message Logged NJSNJSNJS!!!", new NullPointerException("NullError"));

            System.out.println("asd");

            Thread.sleep(1000);

        }
    }

}
