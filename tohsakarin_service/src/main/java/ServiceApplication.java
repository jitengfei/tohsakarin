import com.c4.entity.User;
import com.c4.service.UserService;
import com.c4.serviceImpl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceApplication {

    private static final Logger logger = LoggerFactory.getLogger(ServiceApplication.class);

    private static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        logger.info("Service 开始启动");
        SpringApplication.run(ServiceApplication.class,args);
        User userByUserId = userService.findUserByUserId(new Long(1));
        logger.info("用户"+userByUserId.toString());
        logger.info("Service 启动完成");
    }

}
