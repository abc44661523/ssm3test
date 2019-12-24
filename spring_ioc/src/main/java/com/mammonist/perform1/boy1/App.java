package com.mammonist.perform1.boy1;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

@Slf4j
public class App {
    public static void main(String[] args) throws SQLException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/config/boy1.xml");
        Girl girl = applicationContext.getBean(FrienceGirl.class);
        log.info("girl = " + girl);
        girl.kiss();
        log.info("==========================================");
        Boy boy = applicationContext.getBean(Boy.class);
        Girl girl1 = boy.getGirl();
        log.info(girl1.toString());
        girl1.kiss();
        log.info("==========================================");
        DruidDataSource druidDataSource = applicationContext.getBean(DruidDataSource.class);
        DruidPooledConnection connection = druidDataSource.getConnection();
        log.info(connection.toString());
        log.info("==========================================");
        UserServlet userServlet = applicationContext.getBean(UserServlet.class);
        userServlet.save(new User());
    }
}
