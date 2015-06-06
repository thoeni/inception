package configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DataConfig {

    @Bean
    public DataSource dataSource() {
        final DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1");
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        System.out.println("Instantiating JDBCTemplate");
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource());
        //  Create test table
        jdbcTemplate.execute("create table User (id int, name varchar)");
        return jdbcTemplate;
    }

}