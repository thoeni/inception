package configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.guice.annotation.GuiceModule;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import play.Play;

import javax.sql.DataSource;

@Configuration
@ComponentScan({"configs", "controllers", "services"})
public class AppConfig {

}