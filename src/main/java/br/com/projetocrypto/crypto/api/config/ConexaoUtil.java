package br.com.projetocrypto.crypto.api.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

import br.com.projetocrypto.crypto.api.Config;

public class ConexaoUtil {
	
	private static DataSource dataSource;
	
	public  static DataSource getDataSource(Config config) {
		if(dataSource == null) {
			BasicDataSource datasourceBasic = new BasicDataSource();
			datasourceBasic.setDriverClassName(config.getDriverClassName());
			datasourceBasic.setUsername(config.getUsername());
			datasourceBasic.setPassword(config.getPassword());
			datasourceBasic.setUrl(config.getUrl());
			dataSource = datasourceBasic;
			
			return dataSource;
		}else {
			return dataSource;
		}
	}
}
