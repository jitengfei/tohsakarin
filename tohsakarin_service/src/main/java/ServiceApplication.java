import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan注解进行指定要扫描的包以及要扫描的类
@ComponentScan(basePackages={"com.c4"})
//springboot集成mybatis 通过@MapperScan()注解指定mapper的扫描包 否则mapper层注不进来
@MapperScan("com.c4.dao")
public class ServiceApplication {

    private static final Logger logger = LoggerFactory.getLogger(ServiceApplication.class);

    public static void main(String[] args) {
        logger.info("Service 开始启动");
        SpringApplication.run(ServiceApplication.class,args);
        logger.info("Service 启动完成");
    }

}
