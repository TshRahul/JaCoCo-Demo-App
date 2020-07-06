import org.junit.Assert;
import org.junit.Test;

public class UserTest {

    User user = new User();

    @Test
    public void testUserWithName() {
        Assert.assertEquals("User: Dave is added successfully", user.addUser("Dave"));
    }

    @Test
    public void testUserWithNull() {
        Assert.assertEquals("Please provide the username", user.addUser(null));
    }

    @Test
    public void testUserWithEmptyName() {
        Assert.assertEquals("Please provide the username", user.addUser(""));
    }

    @Test
    public void testUserWithAdminName() {
        Assert.assertEquals("Username Admin is not allowed", user.addUser("Admin"));
    }
}
