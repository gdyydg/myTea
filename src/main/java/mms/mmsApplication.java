package mms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@MapperScan("org.spring.springboot.dao")
public class mmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(mmsApplication.class,args);
    }
}
