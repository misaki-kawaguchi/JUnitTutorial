package com.misakikawaguchi.tutorial

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Suite

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

@RunWith(Suite::class)
@Suite.SuiteClasses(FizzBuzzTest::class, CircleTest::class)
class SuiteTest {} // クラス名は任意