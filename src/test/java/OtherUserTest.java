import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class OtherUserTest {
    @Mock
    private User u;
    private OtherUser user;

    @BeforeEach
    void setUp() {
        this.user = new OtherUser(this.u);
    }

    @Test
    public void me() {
        //when
        user.me(u);
        //then
        verify(u).exists(true);
    }
}
