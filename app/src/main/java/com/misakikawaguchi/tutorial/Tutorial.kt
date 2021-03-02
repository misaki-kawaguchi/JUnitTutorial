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

class FizzBuzz {
    fun fbCheck(n: Int): String {
        return when {
            n % 15 == 0 -> "FizzBuzz"
            n % 3 == 0 -> "Fizz"
            n % 5 == 0 -> "Buzz"
            else -> n.toString()
        }
    }
}
class Circle(var pi: Double = 3.14) {
    fun getArea(radius: Int): Double {
        return radius * radius * pi
    }
}