import configs.AppConfig;
import models.User;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import static org.fest.assertions.Assertions.assertThat;

@ContextConfiguration(classes={AppConfig.class, TestDataConfig.class})
public class UserTest extends AbstractTransactionalJUnit4SpringContextTests {
 
    @Test
    public void setUserName() {
        User user = new User();
        user.setName("foo");
        assertThat(user.getName()).isEqualTo("foo");
    }

}
