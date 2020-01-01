package com.blog.jacoco.domain;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void 정수와_정수를_더한다() {
        long result = calculator.add(2147483647, 1);
        assertThat(result).isEqualTo(2147483648L);
    }

    @Test
    void 정수와_정수를_뺀다() {
        long result = calculator.subtract(5, 100);
        assertThat(result).isEqualTo(-95L);
    }

    @Test
    void 정수와_정수를_곱한다() {
        long result = calculator.multiply(5, 100);
        assertThat(result).isEqualTo(500);

    }

    @Test
    void 정수와_정수를_나눈다() {
        long result = calculator.divide(100, 5);
        assertThat(result).isEqualTo(20);

    }


    @Test
    void 영으로_나누면_에러(){
        assertThatThrownBy(() -> calculator.divide(100, 0)).isInstanceOf(IllegalArgumentException.class);

    }

    @Test
    void makeStaticCalculator() {
        Calculator calculator = new Calculator().makeStaticCalculator();
        Calculator calculator1 = new Calculator().makeStaticCalculator();

        assertThat(calculator.hashCode()).isEqualTo(calculator1.hashCode());
    }
}
