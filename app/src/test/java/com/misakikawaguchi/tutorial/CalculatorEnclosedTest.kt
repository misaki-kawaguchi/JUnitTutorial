package com.misakikawaguchi.tutorial

import org.assertj.core.api.Assertions.assertThat
import org.junit.Before
import org.junit.Test
import org.junit.experimental.runners.Enclosed
import org.junit.runner.RunWith

@RunWith(Enclosed::class)
class CalculatorEnclosedTest {

    class 初期値が1 {
        lateinit var sut: CalculatorEnclosed
        @Before
        fun setUp() {
            sut = CalculatorEnclosed(1)
        }

        @Test
        fun multiplyで1と1の掛け算をしたら1を返す() {
            val actual = sut.multiply(1,1)
            val expected = 1
            assertThat(actual).isEqualTo(expected)
        }
        @Test
        fun multiplyで1と2の掛け算をしたら1を返す() {
            val actual = sut.multiply(1,2)
            val expected = 2
            assertThat(actual).isEqualTo(expected)
        }
    }

    class 初期値が2 {
        lateinit var sut: CalculatorEnclosed
        @Before
        fun setUp() {
            sut = CalculatorEnclosed(2)
        }

        @Test
        fun multiplyで1と1の掛け算をしたら2を返す() {
            val actual = sut.multiply(1,1)
            val expected = 2
            assertThat(actual).isEqualTo(expected)
        }
        @Test
        fun multiplyで1と2の掛け算をしたら1を返す() {
            val actual = sut.multiply(1,2)
            val expected = 4
            assertThat(actual).isEqualTo(expected)
        }
    }
}