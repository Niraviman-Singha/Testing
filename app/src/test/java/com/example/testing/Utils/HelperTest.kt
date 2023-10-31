package com.example.testing.Utils

import org.junit.After
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class HelperTest {
    lateinit var helper: Helper

    @Before
    fun setUp(){
        helper = Helper()
    }

    @After
    fun tearDown(){
        println("After every testcase")
    }

    @Test
    fun isPallindrome() {

        // Arrange


        //Act
        val result = helper.isPallindrome("")

        //Assert
        assertEquals(false,result)

    }

    @Test
    fun isPallindrome_for_true_test() {

        // Arrange

        //Act
        val result = helper.isPallindrome("level")

        //Assert
        assertEquals(true,result)

    }
}