package com.misakikawaguchi.tutorial

import org.assertj.core.api.Assertions.assertThat
import org.junit.Before
import org.junit.Test

class CalculatorTest {
    lateinit var sut: Calculator

    @Before
    fun setUp() {
        // テスト対象オブジェクト
        sut = Calculator()
    }

    @Test
    fun multiplyで2と3を掛けたら6が取得できる() {

        // 実測値
        val actual = sut.multiply(2, 3)
        // 期待値
        val expected = 6
        // アサーション（実測値が期待値と等しい）
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun multiplyで0と3を掛けたら0が取得できる() {
        // 実測値
        val actual = sut.multiply(0, 3)
        // 期待値
        val expected = 0
        // アサーション（実測値が期待値と等しい）
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun divideで6を2で割ったら3を取得できる() {
        // 実測値
        val actual = sut.divide(6, 2)
        // 期待値
        val expected = 3.0
        // アサーション
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun divideで3を2で割った結果を取得できる() {
        // 実測値
        val actual = sut.divide(3, 2)
        // 期待値
        val expected = 1.5
        // アサーション
        assertThat(actual).isEqualTo(expected)
    }

    @Test(expected = IllegalArgumentException::class)
    fun divideで3を0で割るとIllegalArgumentExceptionが送出される() {
        // 実測値
        val actual = sut.divide(3, 0)
    }
}