package com.example.sharding;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ShardingDataSourceProperty.class)
public class FriendConfig {

	private final ShardingDataSourceProperty property;

	public FriendConfig(ShardingDataSourceProperty property) {
		this.property = property;
	}


}
