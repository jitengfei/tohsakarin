import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceApplication {

    private static final Logger logger = LoggerFactory.getLogger(ServiceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class,args);
        logger.info("Service 启动完成");
    }

}
