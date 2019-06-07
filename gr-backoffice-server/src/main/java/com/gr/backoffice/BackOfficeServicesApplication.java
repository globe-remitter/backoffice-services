package com.gr.backoffice;

import com.gr.backoffice.common.dao.IAccountDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = "com.gr", exclude =  {FlywayAutoConfiguration.class, FlywayAutoConfiguration.class})
public class BackOfficeServicesApplication extends ServletInitializer implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(BackOfficeServicesApplication.class);
    @Autowired
    private IAccountDao accountDao;
    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "local");
        ApplicationContext context = SpringApplication.run(BackOfficeServicesApplication.class, args);
        LOGGER.info("*** globe remitter back office application started ***");
    }

    @Override
    public void run(String... args) throws Exception {
        //accountDao.get(101);
    }
}
