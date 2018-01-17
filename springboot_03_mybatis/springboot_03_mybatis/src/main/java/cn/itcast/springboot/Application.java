package cn.itcast.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot启动类
 * @author Administrator
 *
 */
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		//启动springboot项目
		SpringApplication.run(Application.class, args);
	}
}
