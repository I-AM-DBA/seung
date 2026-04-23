package com.lxp.jdbc;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class JDBConnection {
    private static HikariDataSource dataSource;

    static {
        try {
            Properties props = new Properties();

            props.load(
                    JDBConnection.class.getClassLoader().getResourceAsStream("config.properties"));
            HikariConfig config = new HikariConfig();
            config.setJdbcUrl(props.getProperty("db.url"));
            config.setUsername("db.username");
            config.setPassword("db.password");

            config.setMaximumPoolSize(10);

            config.setMaximumPoolSize(5);

            config.setConnectionTimeout(30000);

            config.setMaxLifetime(1800000);

            config.setConnectionTimeout(2000);

            dataSource = new HikariDataSource(config);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    public static void close() {
        if (dataSource != null) {
            dataSource.close();
        }
    }


}
