package com.example.circlecii

import junit.framework.TestCase
import org.junit.Test

class StatisticsUtilsKtTest : TestCase() {

    @Test
    fun testGetActiveAndCompletedStats() {

        // Create an active task (the false makes this active)
        val tasks = listOf<Task>(
            Task("title", "desc", isCompleted = false)
        )
        // Call your function
        val result = getActiveAndCompletedStats(tasks)

        // Check the result
        assertEquals(result.completedTasksPercent, 0f)
        assertEquals(result.activeTasksPercent, 100f)
//        assertEquals(4,2+2)
    }
}