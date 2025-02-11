package com.example.sharding;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@ConfigurationProperties("datasource.friend")
public class ShardingDataSourceProperty {

	private final List<Shard> shards;

	public ShardingDataSourceProperty(List<Shard> shards) {
		this.shards = shards;
	}

	@Getter
	public static class Shard {
		private final String username;
		private final String password;
		private final Property master;
		private final List<Property> slaves;

		public Shard(String username, String password, Property master, List<Property> slaves) {
			this.username = username;
			this.password = password;
			this.master = master;
			this.slaves = slaves;
		}
	}

	@Getter
	public static class Property {
		private final String name;
		private final String url;

		public Property(String name, String url) {
			this.name = name;
			this.url = url;
		}
	}
}
