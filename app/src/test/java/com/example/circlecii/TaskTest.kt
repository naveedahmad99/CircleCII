package com.example.circlecii

import junit.framework.TestCase

class TaskTest : TestCase(){
    fun testGetActiveAndCompletedStats() {
        val task = Task("test", "desc", false)
        assertEquals("test",task.title)
    }
}