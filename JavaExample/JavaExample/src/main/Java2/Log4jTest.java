package src.main.Java2;

/**
 * Created by byang on 2018-06-13.
 */

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


 class Log4jTest {
    //Get the Logger object.
    private static Logger log = Logger.getLogger(Log4jTest.class);



    public static void main(String[] args) {
        //Configuring Log4j,It will log all messages on console.
        //BasicConfigurator use ConsoleAppender and PatternLayout
        //for all loggers.
        BasicConfigurator.configure();

        //logger messages
        //logger messages
        log.debug("Log4j debug message test.");
        log.info("Log4j info message test.");
        log.warn("Log4j warn message test.");
        log.error("Log4j error message test.");
        log.fatal("Log4j fatal message test.");
    }
}