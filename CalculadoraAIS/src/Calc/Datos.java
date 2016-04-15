package Calc;

import javax.swing.*;

public class Datos {

    String op = "";
    String num1, num2;
    Double sum, multi, div, rest, result;
    Datos auxCalc, auxCalc2, auxCalc3, parenAnt; //auxCalc * y +, auxCalc2 inmediatos y ^, auxCalc3 y auxCalc4 parentesis

    public void asignar(Datos calculadora) {
        op = calculadora.op;
        num1 = calculadora.num1;
        num2 = calculadora.num2;
        sum = calculadora.sum;
        rest = calculadora.rest;
        multi = calculadora.multi;
        div = calculadora.div;
        result = calculadora.result;

    }

    public Datos() {
        num1 = "0";
        op = "";
        num2 = "0";
    }

    public void operacion(String cadena, String oper) {
        num1 = cadena;
        op = oper;
    }

    public void limpiar() {
        num1 = "0";
        op = "";
        num2 = "0";
        auxCalc = new Datos();
        auxCalc2 = new Datos();
        auxCalc3 = new Datos();
    }

    String realizarOperacion(String cadena) {
        String stringResult;
        num2 = cadena;
        double auxToRad;

        if (!"".equals(num1) && !"".equals(op) && !"".equals(num2)) {
            switch (op) {
                case "+":
                    sum = Double.parseDouble(num1) + Double.parseDouble(num2);
                    result = sum;
                    break;
                case "-":
                    rest = Double.parseDouble(num1) - Double.parseDouble(num2);
                    result = rest;
                    break;
                case "*":
                    result = Double.parseDouble(num1) * Double.parseDouble(num2);
                    break;
                case "/":
                    result = Double.parseDouble(num1) / Double.parseDouble(num2);
                    break;
                case "%":
                    result = Double.parseDouble(num1) % Double.parseDouble(num2);
                    break;
                case "^":
                    result = Math.pow(Double.parseDouble(num1), Double.parseDouble(num2));
                    op = "";
                default:
                    break;
            }
        } else {
            switch (op) {
                case "!":
                    result = 1.0;
                    Double factAux = Double.parseDouble(num1);
                    while (factAux > 1) {
                        result *= factAux;
                        factAux -= 1;
                    }
                    break;
                case "1/x":
                    result = 1 / Double.parseDouble(num1);
                    break;

                case "raiz":
                    result = Math.sqrt(Double.parseDouble(num1));
                    break;
                case "sin":
                    auxToRad = Double.parseDouble(num1) * 0.01745329251;
                    result = Math.sin(auxToRad);
                    break;
                case "cos":
                    auxToRad = Double.parseDouble(num1) * 0.01745329251;
                    result = Math.cos(auxToRad);
                    break;
                case "tan":
                    auxToRad = Double.parseDouble(num1) * 0.01745329251;
                    result = Math.tan(auxToRad);
                    break;
                case "ln":
                    result = Math.log(Double.parseDouble(num1));
                    break;
                case "log":
                    result = Math.log10(Double.parseDouble(num1));
                    break;
                case "x^2":
                    result = Math.pow(Double.parseDouble(num1), 2);
                    break;
                case "x^3":
                    result = Math.pow(Double.parseDouble(num1), 3);
                    break;
                default:
                    break;
            }
        }
        stringResult = Double.toString(result);
        return stringResult;
    }
}
