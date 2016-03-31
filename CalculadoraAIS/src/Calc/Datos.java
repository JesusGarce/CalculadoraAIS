package Calc;
import javax.swing.*;

public class Datos {

	  String op="";
      String num1,num2;
      Double sum,multi,div,rest,result;
	
	public Datos(){
        num1="";
        op="";
        num2="";
    } 
	
	public void operacion(String cadena, String oper){
        num1=cadena;
        op=oper;
    }
        
	public void limpiar() {
	        num1="";
	        op="";
	        num2="";
	    }

	 String realizarOperacion(String cadena) {
	        String stringResult;
	        num2=cadena;

	        if (!"".equals(num1) && !"".equals(op) && !"".equals(num2)) {
	            switch(op){
	                case "+":
	                	sum=Double.parseDouble(num1)+Double.parseDouble(num2);
	                    result = sum;
	                    break;
	                case "-":
	                	rest=Double.parseDouble(num1)-Double.parseDouble(num2);
	                	result = rest;
	                    break;
	                case "*":
	                    result=Double.parseDouble(num1)*Double.parseDouble(num2);
	                    break;
	                case "/":
	                    result=Double.parseDouble(num1)/Double.parseDouble(num2);
	                    break;
	                case "%":
	                    result=Double.parseDouble(num1)%Double.parseDouble(num2);
	                    break;
	                default:
	                    break;
	            }
	            stringResult = Double.toString(result);
	        }   
	        else if ("1/x".equals(op)) {
	            result = 1/Double.parseDouble(num1);
	            stringResult = Double.toString(result);
	        } else stringResult = num2;
	     
	        return stringResult;
	    }
	}    