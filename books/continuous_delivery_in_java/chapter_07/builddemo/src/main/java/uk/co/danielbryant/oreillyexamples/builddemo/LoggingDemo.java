package uk.co.danielbryant.oreillyexamples.builddemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingDemo {
	public static final Logger LOGGER = LoggerFactory.getLogger(LoggingDemo.class);

	public static void main(String[] args) {
		LOGGER.info("Hello, (Logging) World!");
	}
}
