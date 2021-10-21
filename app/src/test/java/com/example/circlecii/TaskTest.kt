package com.example.circlecii

import junit.framework.TestCase
import org.junit.Test

class TaskTest : TestCase(){
    @Test
    fun testGetActiveAndCompletedStats() {
        val task = Task("test", "desc", false)
        assertEquals("test",task.title)
    }
}