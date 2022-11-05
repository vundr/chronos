package org.vundr.chronos.bootstrapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
class SpringApplicationBootstrapper {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(SpringApplicationBootstrapper.class);
        while (true) {
            System.out.println("I'm alive!!! [" + LocalDateTime.now() + "]");
            Thread.sleep(5000L);
        }
    }
}
