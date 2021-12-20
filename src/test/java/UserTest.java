import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user;

    @BeforeEach
    void setUp() {
        this.user = new User("xx", "yyy", "123");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @Disabled
    void exists() {
        assertTrue(this.user.exists(true));
    }

    @Test
    @Disabled
    void notExists() {
        assertFalse(this.user.notExists(true));
    }

    @Test
    void ppcmAEqualB() {
        //given
        int a = 2;
        int b = 2;
        //when
        int result = user.ppcm(a, b);
        int expected = 2;
        //then
        assertEquals(result, expected);
    }

    @Test
    void ppcmAGreaterThanB() {
        //given
        int a = 4;
        int b = 2;
        //when
        int result = user.ppcm(a, b);
        int expected = 4;
        //then
        assertEquals(result, expected);
    }

    @Test
    void ppcmALessThanB() {
        //given
        int a = 2;
        int b = 4;
        //when
        int result = user.ppcm(a, b);
        int expected = 4;
        //then
        assertEquals(result, expected);
    }
}