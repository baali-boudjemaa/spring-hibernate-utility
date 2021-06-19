package com.stock.spring.hibernate.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DBUtils {

	@Autowired
	private DataSource dataSource;
	
	@PostConstruct
	public void initialize(){
		try {
			Connection connection = dataSource.getConnection();
			Statement statement = connection.createStatement();
			statement.execute("DROP TABLE IF EXISTS PERSON_INFO");
			statement.executeUpdate(
					"CREATE TABLE PERSON_INFO(" +
					"ID INTEGER Primary key, " +
					"FIRST_NAME varchar(30) not null, " +
					"LAST_NAME varchar(30) not null)"
					);
			statement.executeUpdate(
					"INSERT INTO PERSON_INFO " +
					"(FIRST_NAME, LAST_NAME) " +
					"VALUES " + "('DONALD', 'TRUMP')"
					);
			statement.close();
			connection.close();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
