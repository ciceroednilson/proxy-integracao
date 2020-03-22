package br.com.ciceroednilson.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@EnableZuulProxy
@SpringBootApplication
public class ProxyIntegracaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProxyIntegracaoApplication.class, args);
	}

}
