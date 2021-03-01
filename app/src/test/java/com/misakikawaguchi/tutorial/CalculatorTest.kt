package com.misakikawaguchi.tutorial

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class CalculatorTest {

    @Test
    fun multiplyで2と3を掛けたら6が取得できる() {
        // テスト対象オブジェクト
        val sut = Calculator()
        // 実測値
        val actual = sut.multiply(2, 3)
        // 期待値
        val expected = 6
        // アサーション（実測値が期待値と等しい）
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun multiplyで0と3を掛けたら0が取得できる() {
        // テスト対象オブジェクト
        val sut = Calculator()
        // 実測値
        val actual = sut.multiply(0, 3)
        // 期待値
        val expected = 0
        // アサーション（実測値が期待値と等しい）
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun divideで6を2で割ったら3を取得できる() {
        // テスト対象オブジェクト
        val sut = Calculator()
        // 実測値
        val actual = sut.divide(6, 2)
        // 期待値
        val expected = 3
        // アサーション
        assertThat(actual).isEqualTo(expected)
    }
}