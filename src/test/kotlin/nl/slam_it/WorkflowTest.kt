package nl.slam_it

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkflowTest {

    @Test
    fun getWorkflow() {
        assertThat(Workflow().getWorkflow()).isEqualTo("workflow")
    }
}