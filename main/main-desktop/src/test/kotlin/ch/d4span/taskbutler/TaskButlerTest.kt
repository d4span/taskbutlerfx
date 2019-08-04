import ch.d4span.taskbutler.TaskButler
import javafx.application.Platform
import kotlin.test.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension
import java.lang.IllegalStateException
import kotlin.test.assertFailsWith
import kotlin.test.expect
import kotlin.test.fail

@ExtendWith(SpringExtension::class)
@SpringBootTest(classes = [TaskButler::class])
class TaskButlerTest {

    /** Tests if the Spring application context loads. **/
    @Test
    fun contextLoads() {
    }

    @Test
    fun isOpenJFXInitialized() {
        assertFailsWith(IllegalStateException::class,
                "OpenJFX should already be initialized."
        ) {
            Platform.startup { }
        }
    }
}