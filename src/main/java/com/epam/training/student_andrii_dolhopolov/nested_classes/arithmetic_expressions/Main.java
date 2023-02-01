package com.epam.training.student_andrii_dolhopolov.nested_classes.arithmetic_expressions;

import static com.epam.training.student_andrii_dolhopolov.nested_classes.arithmetic_expressions.Expressions.*;

public class Main {
    public static void main(String[] args) {
        Expression expression = fraction(
                product(
                        var("a", 5),
                        sum(
                                val(8),
                                var("b", 22)
                        )
                ),
                difference(
                        val(100),
                        var("c", 98)
                )
        );

        System.out.println("((a * (8 + b)) / (100 - c))".contentEquals(expression.toExpressionString()));
        System.out.println(75 == expression.evaluate());
    }
}
