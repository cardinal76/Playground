package it.cardinali.playground;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlaygroundApplication {
  private static Logger logger = LoggerFactory.getLogger(PlaygroundApplication.class);
  public static void main(String[] args) {
    SpringApplication.run(PlaygroundApplication.class, args);
    logger.debug("log debug for test at start up");
  }

}
