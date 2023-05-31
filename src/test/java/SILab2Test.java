import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void everyBranchTest() {
        List<User> users = new ArrayList<>();

        // Test case 1
        User user1 = new User(null, "password1", "email1@gmail.com");
        assertThrows(RuntimeException.class, () -> SILab2.function(user1, users), "Mandatory information missing!");

        // Test case 2
        User user2 = new User("username2", null, "email2@gmail.com");
        assertThrows(RuntimeException.class, () -> SILab2.function(user2, users), "Mandatory information missing!");

        // Test case 3
        User user3 = new User("username3", "password3", null);
        assertThrows(RuntimeException.class, () -> SILab2.function(user3, users), "Mandatory information missing!");

        // Test case 4
        User user4 = new User(null, "password4", "email4@gmail.com");
        users.add(user4);
        assertTrue(SILab2.function(user4, users));
    }

    @Test
    void multipleConditionsTest() {
        List<User> users = new ArrayList<>();

        // Test case 1
        User user1 = new User(null, null, null);
        assertThrows(RuntimeException.class, () -> SILab2.function(user1, users), "Mandatory information missing!");

        // Test case 2
        User user2 = new User("username2", null, null);
        assertThrows(RuntimeException.class, () -> SILab2.function(user2, users), "Mandatory information missing!");

        // Test case 3
        User user3 = new User("username3", "password3", null);
        assertThrows(RuntimeException.class, () -> SILab2.function(user3, users), "Mandatory information missing!");

        // Test case 4
        User user4 = new User("username4", "password4", "email4@gmail.com");
        users.add(user4);
        assertTrue(SILab2.function(user4, users));

    }
}
