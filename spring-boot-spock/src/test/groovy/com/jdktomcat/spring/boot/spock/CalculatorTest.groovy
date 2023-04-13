package com.jdktomcat.spring.boot.spock

import spock.lang.Specification
import spock.lang.Title
import spock.lang.Unroll

@Title("计算器测试类")
class CalculatorTest extends Specification {

    def calculator = new Calculator()

    def setup() {
    }

    def cleanup() {
    }

    def "should return the real size of the input string"() {
        expect:
        str.size() == length

        where:
        str     | length
        "Spock" | 5
        "Kirk"  | 4
        "Scotty"| 6
    }

    // 测试不通过
    def "should return a+b value"() {
        expect:
        calculator.sum(1,1) == 1
    }

    // 不建议用中文哦
    @Unroll
    def "返回值为输入值之和"() {

        expect:
        c == calculator.sum(a, b)

        where:
        a | b | c
        1 | 2 | 3
        2 | 3 | 5
        10 | 2 | 12
    }
}
