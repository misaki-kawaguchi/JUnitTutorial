package com.misakikawaguchi.tutorial

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class CalculatorTest {

    @Test
    fun multiplyで掛け算の掛け算の結果が取得できる() {
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
    fun divide() {
    }
}