package ua.com.integrity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.camunda.bpm.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.camunda.bpm.engine.impl.cfg.ProcessEnginePlugin;
import org.camunda.bpm.engine.spring.SpringProcessEngineConfiguration;
import org.camunda.spin.plugin.impl.SpinProcessEnginePlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class Config {
	@Bean
	public DataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://192.168.1.208:5432/hiring");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres");
		return dataSource;
	}

	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan(new String[] { "ua.com.integrity.model.company" });
		sessionFactory.setHibernateProperties(hibernateProperties());

		return sessionFactory;
	}

	Properties hibernateProperties() {
		return new Properties() {
			{
				setProperty("hibernate.hbm2ddl.auto", "update");
				setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
				setProperty("hibernate.globally_quoted_identifiers", "true");
				setProperty("hibernate.show_sql", "true");
			}
		};
	}

	@Bean
	public PlatformTransactionManager transactionManager() {
		return new DataSourceTransactionManager(dataSource());
	}

	@Bean
	public ProcessEngineConfigurationImpl processEngineConfiguration() throws IOException {
		SpringProcessEngineConfiguration config = new SpringProcessEngineConfiguration();
		config.setDataSource(dataSource());
		config.setTransactionManager(transactionManager());
		config.setDatabaseSchemaUpdate("true");
		config.setJobExecutorActivate(true);
		config.setAuthorizationEnabled(true);
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		// config.setDeploymentResources(resolver.getResources("classpath:/bpmn/processLight.bpmn"));
		config.setDeploymentResources(resolver.getResources("classpath:/bpmn/*.bpmn"));
		List<ProcessEnginePlugin> processEnginePlugins = new ArrayList<>();
		SpinProcessEnginePlugin spinProcessEnginePlugin = new SpinProcessEnginePlugin();
		processEnginePlugins.add(spinProcessEnginePlugin);
		config.setProcessEnginePlugins(processEnginePlugins);
		return config;
	}
}
