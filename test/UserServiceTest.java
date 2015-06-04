import configs.AppConfig;
import models.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import services.UserService;

import java.util.List;

import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.running;

@ContextConfiguration(classes={AppConfig.class, TestDataConfig.class})
public class UserServiceTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private UserService userService;

    @Test
    public void createUser() {
        User user = new User();
        user.setName("foo");
        userService.addUser(user);
        assertThat(user.getId()).isNotNull();
    }

    @Test
    public void getUsers() {
        createUser();
        List<User> users = userService.getAllUsers();
        assertThat(users.size()).isEqualTo(1);
    }

}