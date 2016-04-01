package Calc;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Interfaz extends JFrame {

    /**
	 * 
	 */
	private final KeyListener listener;
    private Datos calculadora = new Datos();
    private final JButton boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9, boton0;
    private final JButton botonSum, botonRes, botonMult, botonDiv, botonIgual, botonMod, botonPunto, botonInv;
    private final JButton botonRaiz, botonPi, botonDoble, botonParenI, botonParenD;
    private final JButton botonReset, botonReset1;
    private JTextField pantalla;
    private boolean existePunto;
   

    Interfaz(Datos calculadoraDatos) {

        listener = new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                char letra = e.getKeyChar();
                String let = String.valueOf(letra);

                switch (let) {
                     
                    case "+":
                        botonSum.doClick();
                        break;
                    case "-":
                        botonRes.doClick();
                        break;
                    case "*":
                        botonMult.doClick();
                        break;
                    case "/":
                        botonDiv.doClick();
                        break;
                    case "%":
                        botonMod.doClick();
                        break;
                    case "c":
                        botonReset.doClick();
                        break;
                    case "i":
                        botonInv.doClick();
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                char letra = e.getKeyChar();
                String let = String.valueOf(letra);

                switch (let) {
                    case ".":
                        if (existePunto){
                            String cadena = pantalla.getText();
                            cadena = cadena.substring(0, cadena.length() - 1);
                            pantalla.setText(cadena);
                        }
                        else existePunto=true;
                    break;
                    case "+":
                        pantalla.setText("");
                        break;
                    case "-":
                        pantalla.setText("");
                        break;
                    case "*":
                        pantalla.setText("");
                        break;
                    case "/":
                        pantalla.setText("");
                        break;
                    case "%":
                        pantalla.setText("");
                        break;
                    case "c":
                        pantalla.setText("");
                        break;
                    case "i":
                        String cadena = pantalla.getText();
                            cadena = cadena.substring(0, cadena.length() - 1);
                            pantalla.setText(cadena);
                        break;
                   
                }
                
            }
        };

        existePunto = false;
        calculadora.asignar(calculadoraDatos);

       this.setIconImage(new ImageIcon(getClass().getResource("../51229.png")).getImage());
        this.setTitle("Calculadora");

        Container panel = this.getContentPane();
        pantalla = new JTextField();
        pantalla.setSize(50, 50);
        panel.add(pantalla, BorderLayout.NORTH);

        JPanel grid = new JPanel();
        grid.setLayout(new GridLayout(5, 5));

        pantalla.addKeyListener(listener);

        botonPi = new JButton("Pi");
        grid.add(botonPi);
        botonPi.setBackground(java.awt.Color.gray);
        botonRaiz = new JButton("Rz");
        grid.add(botonRaiz);
        botonRaiz.setBackground(java.awt.Color.gray);
        botonDoble = new JButton("x2");
        grid.add(botonDoble);
        botonDoble.setBackground(java.awt.Color.gray);
        botonParenI = new JButton("(");
        grid.add(botonParenI);
        botonParenI.setBackground(java.awt.Color.gray);
        botonParenD = new JButton (")");
        grid.add(botonParenD);
        botonParenD.setBackground(java.awt.Color.gray);
        boton7 = new JButton("7");
        grid.add(boton7);
        boton7.setBackground(java.awt.Color.white);
        boton8 = new JButton("8");
        grid.add(boton8);
        boton8.setBackground(java.awt.Color.white);
        boton9 = new JButton("9");
        grid.add(boton9);
        boton9.setBackground(java.awt.Color.white);
        botonDiv = new JButton("/");
        grid.add(botonDiv);
        botonDiv.setBackground(java.awt.Color.gray);
        botonInv = new JButton("1/x");
        grid.add(botonInv);
        botonInv.setBackground(java.awt.Color.gray);
        boton4 = new JButton("4");
        grid.add(boton4);
        boton4.setBackground(java.awt.Color.white);
        boton5 = new JButton("5");
        grid.add(boton5);
        boton5.setBackground(java.awt.Color.white);
        boton6 = new JButton("6");
        grid.add(boton6);
        boton6.setBackground(java.awt.Color.white);
        botonMult = new JButton("*");
        grid.add(botonMult);
        botonMult.setBackground(java.awt.Color.gray);
        botonMod = new JButton("%");
        grid.add(botonMod);
        botonMod.setBackground(java.awt.Color.gray);
        boton1 = new JButton("1");
        grid.add(boton1);
        boton1.setBackground(java.awt.Color.white);
        boton2 = new JButton("2");
        grid.add(boton2);
        boton2.setBackground(java.awt.Color.white);
        boton3 = new JButton("3");
        grid.add(boton3);
        boton3.setBackground(java.awt.Color.white);
        botonSum = new JButton("+");
        grid.add(botonSum);
        botonSum.setBackground(java.awt.Color.gray);
        botonRes = new JButton("-");
        grid.add(botonRes);
        botonRes.setBackground(java.awt.Color.gray);
        boton0 = new JButton("0");
        grid.add(boton0);
        boton0.setBackground(java.awt.Color.white);
        botonReset = new JButton("CE");
        grid.add(botonReset);
        botonReset.setBackground(java.awt.Color.gray);
        botonReset1 = new JButton("C");
        grid.add(botonReset1);
        botonReset1.setBackground(java.awt.Color.gray);
        botonIgual = new JButton("=");
        grid.add(botonIgual);
        botonIgual.setBackground(java.awt.Color.gray);
        botonPunto = new JButton(".");
        grid.add(botonPunto);
        botonPunto.setBackground(java.awt.Color.gray);
        
        panel.add(grid, BorderLayout.CENTER);

        JButton botonAyuda = new JButton("Ayuda (?)");
        panel.add(botonAyuda, BorderLayout.SOUTH);
        botonAyuda.setBackground(java.awt.Color.white);

        pantalla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonIgual.doClick();
            }
        });
        
        boton0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText() + "0");
                pantalla.requestFocus();
            }
        });
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText() + "1");
                pantalla.requestFocus();
            }
        });
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText() + "2");
                pantalla.requestFocus();
            }
        });
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText() + "3");
                pantalla.requestFocus();

            }
        });
        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText() + "4");
                pantalla.requestFocus();
            }
        });
        boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText() + "5");
                pantalla.requestFocus();
            }
        });
        boton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText() + "6");
                pantalla.requestFocus();
            }
        });
        boton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText() + "7");
                pantalla.requestFocus();
            }
        });
        boton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText() + "8");
                pantalla.requestFocus();
            }
        });
        boton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText() + "9");
                pantalla.requestFocus();
            }
        });
        botonSum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!pantalla.getText().isEmpty()) {
                     if (calculadora.num1.isEmpty()){
                     calculadora.operacion(pantalla.getText(), "+");
                     }
                     else{
                     calculadora.operacion(calculadora.realizarOperacion(pantalla.getText()), "+");
                     }
                    
                }
                pantalla.setText("");
                pantalla.requestFocus();
            }
        });
        botonRes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if (!pantalla.getText().isEmpty()) {
                     if (calculadora.num1.isEmpty()){
                     calculadora.operacion(pantalla.getText(), "-");
                     }
                     else{
                     calculadora.operacion(calculadora.realizarOperacion(pantalla.getText()), "-");
                     }
                    
                }
                pantalla.setText("");
                pantalla.requestFocus();
            }
        });

        botonDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              if (!pantalla.getText().isEmpty()) {
                     if (calculadora.num1.isEmpty()){
                     calculadora.operacion(pantalla.getText(), "/");
                     }
                     else{
                     calculadora.operacion(calculadora.realizarOperacion(pantalla.getText()), "/");
                     }
                    
                }
                pantalla.setText("");
                pantalla.requestFocus();
            }
        });

        botonMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!pantalla.getText().isEmpty()) {
                     if (calculadora.num1.isEmpty()){
                     calculadora.operacion(pantalla.getText(), "*");
                     }
                     else{
                     calculadora.operacion(calculadora.realizarOperacion(pantalla.getText()), "*");
                     }
                    
                }
                pantalla.setText("");
                pantalla.requestFocus();
            }
        });

        botonMod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!pantalla.getText().isEmpty()) {
                     if (calculadora.num1.isEmpty()){
                     calculadora.operacion(pantalla.getText(), "%");
                     }
                     else{
                     calculadora.operacion(calculadora.realizarOperacion(pantalla.getText()), "%");
                     }
                    
                }
                pantalla.setText("");
                pantalla.requestFocus();
            }
        });

        botonInv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!pantalla.getText().isEmpty()) {
                    if(calculadora.num1.isEmpty()){
                    calculadora.operacion(pantalla.getText(),"1/x");
                    pantalla.setText(calculadora.realizarOperacion(""));
                    }
                    else{
                      calculadora.auxCalc = new Datos();
                      calculadora.auxCalc.operacion(pantalla.getText(),"1/x");
                      pantalla.setText(calculadora.auxCalc.realizarOperacion(""));
                    }
                }
                pantalla.requestFocus();
            }
        });

        botonPunto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String aux = pantalla.getText();
                
                if (aux.isEmpty()){
                    pantalla.setText("0.");
                    existePunto = true;
                }
                else if (existePunto==true){
               
                }
                else {
                    pantalla.setText(aux+".");
                    existePunto=true;
                }
                pantalla.requestFocus();
            }
        });
        
        botonReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText("");
                calculadora.limpiar();
                existePunto=false;
                pantalla.requestFocus();
            }
        });

        botonReset1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!pantalla.getText().isEmpty()) {
                    String cadena = pantalla.getText();
                    String borrado = cadena.substring(cadena.length()-1, cadena.length());
                    cadena = cadena.substring(0, cadena.length() - 1);
                    pantalla.setText(cadena);
                    
                    if (".".equals(borrado))
                        existePunto=false;
                }
                pantalla.requestFocus();
            }
        });

        botonIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!pantalla.getText().isEmpty()) {
                    pantalla.setText(calculadora.realizarOperacion(pantalla.getText()));
                }
                pantalla.requestFocus();
            }
        });

        botonAyuda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ayuda ayuda = new Ayuda();
                ayuda.setVisible(true);

            }
        });

        this.setSize(300, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
