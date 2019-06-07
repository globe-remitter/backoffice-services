package com.gr.backoffice.data.flyway;

import org.flywaydb.core.Flyway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

@Component
public class FlywayMigrator {

    private static Logger LOGGER = LoggerFactory.getLogger(FlywayMigrator.class);
    @Autowired
    @Lazy
    private DataSource dataSource;

    @Value("${app.flyway.locations}")
    private String locations;

    @Value("${app.flyway.enabled}")
    private boolean isFlywayEnabled;
    @PostConstruct
    public void init()
    {
        migrate(dataSource);
    }

    private void migrate(DataSource dataSource)
    {
        String locations[] = getLocations().split(",");
        LOGGER.info("about to start flyway migration");
        if(isFlywayEnabled) {
            Flyway.configure().dataSource(dataSource).locations(locations).load().migrate();
            LOGGER.info("flyway migration completed");
        }
    }

    private String getLocations()
    {
        return  locations;
    }

}
