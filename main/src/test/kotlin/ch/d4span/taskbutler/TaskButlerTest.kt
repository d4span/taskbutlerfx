import ch.d4span.taskbutler.TaskButler
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
@SpringBootTest(classes = [TaskButler::class])
class TaskButlerTest {

    /** Tests if the Spring application context loads. **/
    @Test
    fun contextLoads() {
    }
}