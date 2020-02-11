package de.nielsfalk.ktor.swagger.sample

import io.ktor.server.engine.*
import java.util.concurrent.TimeUnit
import org.junit.Test

class ApplicationTest {

    @Test
    fun `start and then imidiately shutdown`() {
        run(8090, wait = false).stop(
            gracePeriod = TimeUnit.SECONDS.toMillis(5),
            timeout = TimeUnit.SECONDS.toMillis(5),
            timeUnit = TimeUnit.MILLISECONDS
        )
    }
}
