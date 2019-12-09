package cn.ekgc.itrip;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <b>项目注册中心启动类</b>
 * @author Qiaojia
 * @version 3.0.0 2019-12-05
 * @since 3.0.0
 */
@EnableEurekaServer
@SpringBootApplication
public class ITripEurekaServerStarter {
	public static void main(String[] args) {
		SpringApplication.run(ITripEurekaServerStarter.class, args);
	}
}
