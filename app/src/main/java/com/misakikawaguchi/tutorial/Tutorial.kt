package com.misakikawaguchi.tutorial

// テスト対処クラス
class Calculator {
    // 掛け算
    fun multiply(x: Int, y: Int): Int {
        return x * y
    }

    // 割り算
    fun divide(x: Int, y: Int): Double {
        // 例外の送出を検証するには、Testアノテーションの​expected属性​を利用する
        if (y == 0) throw IllegalArgumentException("divide by zero.")
        return x / y.toDouble()
    }
}