package me.snikit.config;

import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableTransactionManagement
public class JpaConfig {
	
	
//	@Bean
//	public DataSource dataSource() {
//		EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
//		return builder.setType(EmbeddedDatabaseType.H2).build();
//	}
//
//	@Bean
//	public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource,
//			JpaVendorAdapter vendorAdapter) {
//		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
//		factory.setJpaVendorAdapter(vendorAdapter);
//		factory.setPackagesToScan(getClass().getPackage().getName());
//		factory.setDataSource(dataSource);
//		return factory;
//	}
//
//	@Bean
//	public JpaVendorAdapter getsetJpaVendorAdapter() {
//		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//		vendorAdapter.setDatabase(Database.HSQL);
//		vendorAdapter.setGenerateDdl(true);
//		return vendorAdapter;
//	}
//
//	@Bean
//	public PlatformTransactionManager transactionManager(LocalContainerEntityManagerFactoryBean entityManagerFactory) {
//		JpaTransactionManager txManager = new JpaTransactionManager();
//		txManager.setEntityManagerFactory(entityManagerFactory.getObject());
//		return txManager;
//	}
}