package com.jie.boot_hello;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.NamedThreadLocal;

@SpringBootTest
class BootHelloApplicationTests {
    private static final ThreadLocal<Long> SCHEDULE_TIME = new NamedThreadLocal<>("scheduleTime");
    @Test
    void contextLoads() {
        SCHEDULE_TIME.set(System.currentTimeMillis());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        SCHEDULE_TIME.remove();
        System.out.println(System.currentTimeMillis() - SCHEDULE_TIME.get());
    }

}
