package kuke.cache.kuke_cache;

import kuke.cache.KukeCacheApplication;
import org.springframework.boot.SpringApplication;

public class TestKukeCacheApplication {

	public static void main(String[] args) {
		SpringApplication.from(KukeCacheApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
