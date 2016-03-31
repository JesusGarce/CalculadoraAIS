/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calc;

import javax.swing.*;


/**
 *
 * @author Jesús, Jose Ignacio y Saúl
 */
public class Ayuda extends JFrame {

    private final JEditorPane texto;

    public Ayuda() {

        JPanel panelContenido = new JPanel();
        this.setContentPane(panelContenido);
        
        this.setTitle("Ayuda");

        texto = new JEditorPane();
        texto.setContentType("text/html");

        texto.setText(
                "<font size=\"20\"><b>Ayuda</b></font><br>"
                + "<br>"               
                + "<b>* ¿Cómo escribir un número o una operación?</b><br>"
                + "Podemos hacerlo de dos formas: con el teclado o con el ratón. <br>"
                + "Ambas formas recogen los números en la pantalla superior. <br>"
                + "<br>"        
                + "<b>* ¿Cómo obtener el resultado de una operación?</b><br>"
                + "Es sencillo, unicamente tenemos que darle al simbolo '=' o pulsar  <br>"
                + " 'ENTER' una vez hemos escrito los dos operandos y la operación. <br>"
                + "<br>"        
                + "<b>* ¿Cómo borrar un único caracter o un número entero?</b><br>"
                + "Para borrar un único caracter debes pulsar el boton 'C'. Para <br>"
                + "borrar un número entero, es decir, hacer reset, debemos pulsar el  <br>"
                + "botón de la calculadora 'CE' o, con el teclado, la tecla 'c'. <br>"
                + "<br>"        
                + "<b>* ¿Qué operaciones se pueden realizar?</b><br>"
                + "Se pueden realizar las típicas 4 operaciones que son: suma(+), <br>"
                + "resta(-), división(/) y multiplicación(*). Además existe <br> "
                + "la opción de hacer un módulo(%) y el inverso(1/x). <br> "
                + "<br>"       
                + "<b>* ¿Cómo podemos realizar las operaciones?</b><br>"
                + "Obviamente se puede hacer pulsando los botones de la calculadora, <br>"
                + "pero además, podemos usar el teclado con las siguientes teclas: <br> "
                + "suma: '+', resta: '-', multiplicación: '*', división: '/', <br> "
                + " modulo: '%' e inverso: 'i'. <br> "
                + "<br>"        
                + "<b>* ¿Podemos calcular números decimales?</b><br>"
                + "Sí, si pulsamos el botón '.' de la calculadora, o pulsamos <br>"
                + "la tecla '.' podemos escribir un número decimal. <br> ");

        panelContenido.add(texto);
        this.setVisible(false);
        this.setResizable(false);
        this.setSize(400, 630);

    }

}
