package ua.com.integrity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.camunda.bpm.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.camunda.bpm.engine.impl.cfg.ProcessEnginePlugin;
import org.camunda.bpm.engine.spring.SpringProcessEngineConfiguration;
import org.camunda.spin.plugin.impl.SpinProcessEnginePlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.transaction.PlatformTransactionManager;


@Configuration
public class Config {
	@Bean
	public DataSource dataSource() {
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		dataSource.setDriverClass(org.h2.Driver.class);
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/hiring");
		dataSource.setUsername("sa");
		dataSource.setPassword("");
		return dataSource;
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
        //config.setDeploymentResources(resolver.getResources("classpath:/bpmn/processLight.bpmn"));
        config.setDeploymentResources(resolver.getResources("classpath:/bpmn/*.bpmn"));
        List<ProcessEnginePlugin> processEnginePlugins = new ArrayList<>();
        SpinProcessEnginePlugin spinProcessEnginePlugin = new SpinProcessEnginePlugin();
        processEnginePlugins.add(spinProcessEnginePlugin);
        config.setProcessEnginePlugins(processEnginePlugins);
        return config;
    }
}
