package com.misakikawaguchi.tutorial

import org.assertj.core.api.Assertions.assertThat
import org.junit.Before
import org.junit.Test
import org.junit.experimental.runners.Enclosed
import org.junit.runner.RunWith

@RunWith(Enclosed::class)
class CounterTest {
    class 初期状態 {
        lateinit var sut: Counter
        @Before
        fun setUp() {
            sut = Counter()
        }

        @Test
        fun decrementを1回実行するとマイナス1を返す() {
            val actual = sut.decrement()
            assertThat(actual).isEqualTo(-1)
        }

        @Test
        fun incrementを1回実行すると1を返す() {
            val actual = sut.increment()
            assertThat(actual).isEqualTo(1)
        }
    }

    class incrementが1回実行された状態() {
        lateinit var sut: Counter
        @Before
        fun setUp() {
            sut = Counter()
            sut.increment()
        }

        @Test
        fun incrementを実行すると2を返す() {
            val actual = sut.increment()
            assertThat(actual).isEqualTo(2)
        }

        @Test
        fun decrementを実行すると0を返す() {
            val actual = sut.decrement()
            assertThat(actual).isEqualTo(0)
        }
    }

    class incrementが100回実行された状態() {
        lateinit var sut: Counter
        @Before
        fun setUp() {
            sut = Counter()
            for ( i in 1..100) sut.increment()
        }

        @Test
        fun incrementを実行すると101を返す() {
            val actual = sut.increment()
            assertThat(actual).isEqualTo(101)
        }

        @Test
        fun decrementを実行すると99を返す() {
            val actual = sut.decrement()
            assertThat(actual).isEqualTo(99)
        }
    }
}