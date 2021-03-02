package com.misakikawaguchi.tutorial

import org.assertj.core.api.Assertions.assertThat
import org.junit.Before
import org.junit.Test

class FizzBuzzTest {
    lateinit var fizzBuzz: FizzBuzz
    @Before
    fun setUp() {
        fizzBuzz = FizzBuzz()
    }

    @Test
    fun fbCheckに3を渡すとFizzを返す() {
        val actual = fizzBuzz.fbCheck(3)
        assertThat(actual).isEqualTo("Fizz")
    }

    @Test
    fun fbCheckに5を渡すとBuzzを返す() {
        val actual = fizzBuzz.fbCheck(5)
        assertThat(actual).isEqualTo("Buzz")
    }

    @Test
    fun fbCheckに15を渡すとFizzBuzzを返す() {
        val actual = fizzBuzz.fbCheck(15)
        assertThat(actual).isEqualTo("FizzBuzz")
    }

    @Test
    fun fbCheckに2を渡すと文字列の2を返す() {
        val actual = fizzBuzz.fbCheck(2)
        assertThat(actual).isEqualTo("2")
    }
}