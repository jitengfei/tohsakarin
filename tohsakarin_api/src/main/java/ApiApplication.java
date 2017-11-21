import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan注解进行指定要扫描的包以及要扫描的类
@ComponentScan(basePackages={"com.c4"})
public class ApiApplication {

    private static final Logger logger = LoggerFactory.getLogger(ApiApplication.class);

    public static void main(String[] args) {
        logger.info("Service 开始启动");
        SpringApplication.run(ApiApplication.class,args);
        logger.info("Service 启动完成");
    }

}
