import com.c4.dao.UserDao;
import com.c4.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServiceApplication.class)
public class ApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    public void test() {
        User user = userDao.selectByPrimaryKey(new Long(1));
    }

}