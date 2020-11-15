package com.ruoyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 *
 * @author 1829003685@qq.com
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,
        org.activiti.spring.boot.SecurityAutoConfiguration.class,
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class
})
public class WorkOrderApplication {
    public static void main(String[] args) {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(WorkOrderApplication.class, args);
        System.out.println(
                "                    _                 _           \n" +
                        "                   | |               | |          \n" +
                        "__      _____  _ __| | _____  _ __ __| | ___ _ __ \n" +
                        "\\ \\ /\\ / / _ \\| '__| |/ / _ \\| '__/ _` |/ _ \\ '__|\n" +
                        " \\ V  V / (_) | |  |   < (_) | | | (_| |  __/ |   \n" +
                        "  \\_/\\_/ \\___/|_|  |_|\\_\\___/|_|  \\__,_|\\___|_|  ");
    }
}
