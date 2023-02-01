package com.epam.training.student_andrii_dolhopolov.nested_classes.arithmetic_expressions;

//import java.util.StringJoiner;

public class Expressions {

    public static Variable var(String name, int value) {
        return new Variable(name, value);
    }

    public static Expression val(int value) {
        return new Expression() {
            @Override
            public int evaluate() {
                return value;
            }

            @Override
            public String toExpressionString() {
                if(value < 0){
                    return String.format("(%d)", value);
                }
                return String.format("%d", value);
            }
        };
    }

    public static Expression sum(Expression... members){
        return new Expression() {
            @Override
            public int evaluate() {
                int sum = 0;
                for (Expression e :
                        members) {
                    sum += e.evaluate();
                }
                return sum;
            }

            @Override
            public String toExpressionString() {
                String str = "(" + members[0].toExpressionString();
                for (int i = 1; i < members.length; i++) {
                    str += " + ";
                    str += members[i].toExpressionString();
                }
                str += ")";
                return str;
            }
        };
    }

    public static Expression product(Expression... members){
        return new Expression() {
            @Override
            public int evaluate() {
                int product = 1;
                for (Expression e :
                        members) {
                    product *= e.evaluate();
                }
                return product;
            }

            @Override
            public String toExpressionString() {
                String str = "(" + members[0].toExpressionString();
                for (int i = 1; i < members.length; i++) {
                    str += " * ";
                    str += members[i].toExpressionString();
                }
                str += ")";
                return str;
            }
        };
    }

    public static Expression difference(Expression minuend, Expression subtrahend){
        return new Expression() {
            @Override
            public int evaluate() {
                return minuend.evaluate() - subtrahend.evaluate();
            }

            @Override
            public String toExpressionString() {
                return String.format("(%s - %s)",minuend.toExpressionString(), subtrahend.toExpressionString());
            }
        };
    }

    public static Expression fraction(Expression dividend, Expression divisor){
        //implement this method
        return new Expression() {
            @Override
            public int evaluate() {
                return dividend.evaluate() / divisor.evaluate();
            }

            @Override
            public String toExpressionString() {
                return String.format("(%s / %s)",dividend.toExpressionString(), divisor.toExpressionString());
            }
        };
    }

}
