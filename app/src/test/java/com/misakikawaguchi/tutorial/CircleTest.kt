package com.misakikawaguchi.tutorial

import org.assertj.core.api.Assertions.*
import org.junit.Test

class CircleTest {

    @Test
    fun コンストラクタのテスト() {
        assertThat(Circle(3.0).pi).isEqualTo(3.0)
    }
    @Test
    fun getAreaのテスト() {
        assertThat(Circle().getArea(3)).isEqualTo(28.26)
        assertThat(Circle().getArea(0)).isEqualTo(0.0)
    }
}