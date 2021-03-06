package Calc;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

/**
 *
 * @author Sergio
 */
public class Interfaz extends javax.swing.JFrame {

    private final KeyListener listener;
    private Datos calculadora = new Datos();
    private Boolean existePunto = false;
    private Integer parentesis = 0; //abre parentesis +1 cierra parent -1 si < 0, mal
    private String lastSymbol = ""; //guarda el ultimo tipo de simbolo para detectar operaciones incoherentes
    private String stringFormula = "";
    private Datos parentAux;

    public Interfaz() {

        int parentesis = 0;
        listener = new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                char letra = e.getKeyChar();
                String let = String.valueOf(letra);

                switch (let) {
                    case "=":
                        botonIgual.doClick();
                        break;
                    case "(":
                        botonParenI.doClick();
                        break;
                    case ")":
                        botonParenD.doClick();
                        break;
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
                    case "c":
                        botonReset.doClick();
                        break;
                    case "i":
                        jbi.doClick();
                        break;
                    case "1":
                        lastSymbol = "num";
                        pantalla.requestFocus();
                        stringFormula = stringFormula + "1";
                        break;
                    case "2":
                        lastSymbol = "num";
                        pantalla.requestFocus();
                        stringFormula = stringFormula + "2";
                        break;
                    case "3":
                        lastSymbol = "num";
                        pantalla.requestFocus();
                        stringFormula = stringFormula + "3";
                        break;
                    case "4":
                        lastSymbol = "num";
                        pantalla.requestFocus();
                        stringFormula = stringFormula + "4";
                        break;
                    case "5":
                        lastSymbol = "num";
                        pantalla.requestFocus();
                        stringFormula = stringFormula + "5";
                        break;
                    case "6":
                        lastSymbol = "num";
                        pantalla.requestFocus();
                        stringFormula = stringFormula + "6";
                        break;
                    case "7":
                        lastSymbol = "num";
                        pantalla.requestFocus();
                        stringFormula = stringFormula + "7";
                        break;
                    case "8":
                        lastSymbol = "num";
                        pantalla.requestFocus();
                        stringFormula = stringFormula + "8";
                        break;
                    case "9":
                        lastSymbol = "num";
                        pantalla.requestFocus();
                        stringFormula = stringFormula + "9";
                        break;
                    case "0":
                        lastSymbol = "num";
                        pantalla.requestFocus();
                        stringFormula = stringFormula + "0";
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                char letra = e.getKeyChar();
                String let = String.valueOf(letra);

                switch (let) {
                    case "=":
                        pantalla.setText(pantalla.getText().substring(0, pantalla.getText().length() - 1));
                        break;
                    case "(":
                        pantalla.setText("");
                        break;
                    case ")":
                        pantalla.setText(pantalla.getText().substring(0, pantalla.getText().length() - 1));
                        break;
                    case ".":
                        if (existePunto) {
                            String cadena = pantalla.getText();
                            cadena = cadena.substring(0, cadena.length() - 1);
                            pantalla.setText(cadena);
                        } else {
                            existePunto = true;
                        }
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
        initComponents();
        calculadora.limpiar();
        calculadora.auxCalc3.limpiar();
        calculadora.auxCalc3.parenAnt = calculadora;
        parentAux = calculadora.auxCalc3;
        this.setResizable(false);
        this.setTitle("Calculadora");
        this.setIconImage(new ImageIcon(getClass().getResource("../51229.png")).getImage());
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        jbOn.setVisible(true);
        pantalla.setVisible(false);
        jbOff.setVisible(false);
        boton9.setVisible(false);
        boton8.setVisible(false);
        boton7.setVisible(false);
        boton6.setVisible(false);
        boton5.setVisible(false);
        boton4.setVisible(false);
        boton3.setVisible(false);
        boton2.setVisible(false);
        boton1.setVisible(false);
        boton0.setVisible(false);
        jbSen.setVisible(false);
        jbCos.setVisible(false);
        jbTan.setVisible(false);
        jbLn.setVisible(false);
        jbCuadrado.setVisible(false);
        jbCubo.setVisible(false);
        jbCubo.setVisible(false);
        jbFactorial.setVisible(false);
        jbLog.setVisible(false);
        jbi.setVisible(false);
        jbRaiz.setVisible(false);
        jbElevado.setVisible(false);
        jbFraccion.setVisible(false);
        botonReset.setVisible(false);
        botonReset1.setVisible(false);
        botonParenD.setVisible(false);
        botonParenI.setVisible(false);
        botonMult.setVisible(false);
        botonDiv.setVisible(false);
        botonPunto.setVisible(false);
        botonIgual.setVisible(false);
        botonSum.setVisible(false);
        botonRes.setVisible(false);
        botonAyuda.setVisible(false);
        botonOperacion.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        botonOperacion = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        pantalla = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jbOn = new javax.swing.JButton();
        botonAyuda = new javax.swing.JButton();
        jbOff = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jbSen = new javax.swing.JButton();
        jbCos = new javax.swing.JButton();
        jbTan = new javax.swing.JButton();
        jbLn = new javax.swing.JButton();
        jbCuadrado = new javax.swing.JButton();
        jbCubo = new javax.swing.JButton();
        jbFactorial = new javax.swing.JButton();
        jbLog = new javax.swing.JButton();
        jbi = new javax.swing.JButton();
        jbRaiz = new javax.swing.JButton();
        jbElevado = new javax.swing.JButton();
        jbFraccion = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        botonReset = new javax.swing.JButton();
        botonReset1 = new javax.swing.JButton();
        botonParenI = new javax.swing.JButton();
        botonParenD = new javax.swing.JButton();
        botonMult = new javax.swing.JButton();
        botonDiv = new javax.swing.JButton();
        boton0 = new javax.swing.JButton();
        botonPunto = new javax.swing.JButton();
        botonIgual = new javax.swing.JButton();
        botonSum = new javax.swing.JButton();
        botonRes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pantalla.addKeyListener(listener);
        pantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pantallaActionPerformed(evt);
            }
        });

        jbOn.setBackground(new java.awt.Color(255, 0, 0));
        jbOn.setText("ON");
        jbOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOnActionPerformed(evt);
            }
        });

        botonAyuda.setBackground(new java.awt.Color(255, 51, 0));
        botonAyuda.setText("AYUDA");
        botonAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAyudaActionPerformed(evt);
            }
        });

        jbOff.setBackground(new java.awt.Color(255, 0, 0));
        jbOff.setText("OFF");
        jbOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOffActionPerformed(evt);
            }
        });

        jbSen.setBackground(new java.awt.Color(0, 0, 0));
        jbSen.setForeground(new java.awt.Color(255, 255, 255));
        jbSen.setText("sin");
        jbSen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSenActionPerformed(evt);
            }
        });

        jbCos.setBackground(new java.awt.Color(0, 0, 0));
        jbCos.setForeground(new java.awt.Color(255, 255, 255));
        jbCos.setText("cos");
        jbCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCosActionPerformed(evt);
            }
        });

        jbTan.setBackground(new java.awt.Color(0, 0, 0));
        jbTan.setForeground(new java.awt.Color(255, 255, 255));
        jbTan.setText("tan");
        jbTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTanActionPerformed(evt);
            }
        });

        jbLn.setBackground(new java.awt.Color(0, 0, 0));
        jbLn.setForeground(new java.awt.Color(255, 255, 255));
        jbLn.setText("ln");
        jbLn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLnActionPerformed(evt);
            }
        });

        jbCuadrado.setBackground(new java.awt.Color(0, 0, 0));
        jbCuadrado.setForeground(new java.awt.Color(255, 255, 255));
        jbCuadrado.setText("x^2");
        jbCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCuadradoActionPerformed(evt);
            }
        });

        jbCubo.setBackground(new java.awt.Color(0, 0, 0));
        jbCubo.setForeground(new java.awt.Color(255, 255, 255));
        jbCubo.setText("x^3");
        jbCubo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCuboActionPerformed(evt);
            }
        });

        jbFactorial.setBackground(new java.awt.Color(0, 0, 0));
        jbFactorial.setForeground(new java.awt.Color(255, 255, 255));
        jbFactorial.setText("x!");
        jbFactorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFactorialActionPerformed(evt);
            }
        });

        jbLog.setBackground(new java.awt.Color(0, 0, 0));
        jbLog.setForeground(new java.awt.Color(255, 255, 255));
        jbLog.setText("log");
        jbLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLogActionPerformed(evt);
            }
        });

        botonOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOperacionActionPerformed(evt);
            }
        });

        jbi.setBackground(new java.awt.Color(0, 0, 0));
        jbi.setForeground(new java.awt.Color(255, 255, 255));
        jbi.setText("i");
        jbi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbiActionPerformed(evt);
            }
        });

        jbRaiz.setBackground(new java.awt.Color(0, 0, 0));
        jbRaiz.setForeground(new java.awt.Color(255, 255, 255));
        jbRaiz.setText("RAÍZ");
        jbRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRaizActionPerformed(evt);
            }
        });

        jbElevado.setBackground(new java.awt.Color(0, 0, 0));
        jbElevado.setForeground(new java.awt.Color(255, 255, 255));
        jbElevado.setText("^");
        jbElevado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbElevadoActionPerformed(evt);
            }
        });

        jbFraccion.setBackground(new java.awt.Color(0, 0, 0));
        jbFraccion.setForeground(new java.awt.Color(255, 255, 255));
        jbFraccion.setText("ab/c");
        jbFraccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFraccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jbCuadrado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                .addComponent(jbSen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jbCubo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbCos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbRaiz, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jbElevado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(29, 29, 29))
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jbFactorial, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jbLog, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jbFraccion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jbTan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbLn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbSen)
                                .addComponent(jbCos)
                                .addComponent(jbTan)
                                .addComponent(jbLn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbCuadrado)
                                .addComponent(jbCubo)
                                .addComponent(jbFactorial)
                                .addComponent(jbLog))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbi)
                                .addComponent(jbRaiz)
                                .addComponent(jbElevado)
                                .addComponent(jbFraccion))
                        .addGap(0, 19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jbOff)
                        .addGap(75, 75, 75)
                        .addComponent(botonOperacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbOn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(botonAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbOn)
                                .addComponent(jbOff)
                                .addComponent(botonOperacion))
                        .addGap(18, 18, 18)
                        .addComponent(botonAyuda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
        );

        boton7.setBackground(new java.awt.Color(255, 255, 255));
        boton7.setText("7");
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });

        botonOperacion.setText("VER OPERACIÓN");
        botonOperacion.setBackground(new java.awt.Color(255, 0, 0));

        boton8.setBackground(new java.awt.Color(255, 255, 255));
        boton8.setText("8");
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });

        boton9.setBackground(new java.awt.Color(255, 255, 255));
        boton9.setText("9");
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });

        boton4.setBackground(new java.awt.Color(255, 255, 255));
        boton4.setText("4");
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });

        boton5.setBackground(new java.awt.Color(255, 255, 255));
        boton5.setText("5");
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });

        boton6.setBackground(new java.awt.Color(255, 255, 255));
        boton6.setText("6");
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });

        boton1.setBackground(new java.awt.Color(255, 255, 255));
        boton1.setText("1");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        boton2.setBackground(new java.awt.Color(255, 255, 255));
        boton2.setText("2");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });

        boton3.setBackground(new java.awt.Color(255, 255, 255));
        boton3.setText("3");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });

        botonReset.setBackground(new java.awt.Color(0, 0, 0));
        botonReset.setForeground(new java.awt.Color(255, 255, 255));
        botonReset.setText("CE");
        botonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonResetActionPerformed(evt);
            }
        });

        botonReset1.setBackground(new java.awt.Color(0, 0, 0));
        botonReset1.setForeground(new java.awt.Color(255, 255, 255));
        botonReset1.setText("C");
        botonReset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReset1ActionPerformed(evt);
            }
        });

        botonParenI.setBackground(new java.awt.Color(0, 0, 0));
        botonParenI.setForeground(new java.awt.Color(255, 255, 255));
        botonParenI.setText("(");
        botonParenI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonParenIActionPerformed(evt);
            }
        });

        botonParenD.setBackground(new java.awt.Color(0, 0, 0));
        botonParenD.setForeground(new java.awt.Color(255, 255, 255));
        botonParenD.setText(")");
        botonParenD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonParenDActionPerformed(evt);
            }
        });

        botonMult.setBackground(new java.awt.Color(0, 0, 0));
        botonMult.setForeground(new java.awt.Color(255, 255, 255));
        botonMult.setText("X");
        botonMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMultActionPerformed(evt);
            }
        });

        botonDiv.setBackground(new java.awt.Color(0, 0, 0));
        botonDiv.setForeground(new java.awt.Color(255, 255, 255));
        botonDiv.setText("/");
        botonDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDivActionPerformed(evt);
            }
        });

        boton0.setBackground(new java.awt.Color(255, 255, 255));
        boton0.setText("0");
        boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0ActionPerformed(evt);
            }
        });

        botonPunto.setBackground(new java.awt.Color(0, 0, 0));
        botonPunto.setForeground(new java.awt.Color(255, 255, 255));
        botonPunto.setText(".");
        botonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPuntoActionPerformed(evt);
            }
        });

        botonIgual.setBackground(new java.awt.Color(0, 0, 0));
        botonIgual.setForeground(new java.awt.Color(255, 255, 255));
        botonIgual.setText("=");
        botonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIgualActionPerformed(evt);
            }
        });

        botonSum.setBackground(new java.awt.Color(0, 0, 0));
        botonSum.setForeground(new java.awt.Color(255, 255, 255));
        botonSum.setText("+");
        botonSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSumActionPerformed(evt);
            }
        });

        botonRes.setBackground(new java.awt.Color(0, 0, 0));
        botonRes.setForeground(new java.awt.Color(255, 255, 255));
        botonRes.setText("-");
        botonRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonResActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(boton0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boton7, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                .addComponent(boton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(botonPunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boton8, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(botonIgual, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                .addComponent(boton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(botonSum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonReset, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                .addComponent(botonParenI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonMult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(botonReset1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                .addComponent(botonParenD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonDiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(boton7)
                                .addComponent(boton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonReset1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(botonParenD)
                                .addComponent(botonParenI)
                                .addComponent(boton6)
                                .addComponent(boton5)
                                .addComponent(boton4))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(botonMult)
                                .addComponent(boton3)
                                .addComponent(boton2)
                                .addComponent(boton1)
                                .addComponent(botonDiv))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(boton0)
                                .addComponent(botonPunto)
                                .addComponent(botonIgual)
                                .addComponent(botonSum)
                                .addComponent(botonRes))
                        .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                .addComponent(pantalla)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOffActionPerformed
        dispose();
    }//GEN-LAST:event_jbOffActionPerformed

    private void botonOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOffActionPerformed
        operacionActual Hola = new operacionActual(stringFormula);
        Hola.setLocationRelativeTo(this);
        Hola.setVisible(true);
    }//GEN-LAST:event_jbOffActionPerformedbotonOperacionActionPerformed

    private void jbTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTanActionPerformed
        if (lastSymbol.equals("num")) {
            if (!pantalla.getText().isEmpty()) {
                stringFormula = stringFormula + "tan";
                existePunto = false;
                lastSymbol = "num"; //es inmediato, con lo que es como si hubiese un num
                if (parentesis == 0) {
                    if (calculadora.op.isEmpty()) {
                        calculadora.operacion(pantalla.getText(), "tan");
                        pantalla.setText(calculadora.realizarOperacion(""));
                        calculadora.limpiar();
                    } else {
                        calculadora.auxCalc2.operacion(pantalla.getText(), "tan");
                        pantalla.setText(calculadora.auxCalc2.realizarOperacion(""));
                        calculadora.auxCalc2.limpiar();
                    }
                } else if (parentesis >= 1) {
                    parentAux.operacion(pantalla.getText(), "tan");
                    pantalla.setText(parentAux.realizarOperacion(""));
                    parentAux.limpiar();
                }

            }
        } else {
            FormulaIncoherente hola = new FormulaIncoherente("tan no puede operar sobre esta fórmula");
            hola.setVisible(true);
        }
        pantalla.requestFocus();

    }//GEN-LAST:event_jbTanActionPerformed

    private void jbLnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTanActionPerformed
        if (lastSymbol.equals("num")) {
            if (!pantalla.getText().isEmpty()) {

                stringFormula = stringFormula + "ln";
                existePunto = false;
                lastSymbol = "num"; //es inmediato, con lo que es como si hubiese un num
                if (parentesis == 0) {
                    if (calculadora.op.isEmpty()) {
                        calculadora.operacion(pantalla.getText(), "ln");
                        pantalla.setText(calculadora.realizarOperacion(""));
                        calculadora.limpiar();
                    } else {
                        calculadora.auxCalc2.operacion(pantalla.getText(), "ln");
                        pantalla.setText(calculadora.auxCalc2.realizarOperacion(""));
                        calculadora.auxCalc2.limpiar();
                    }
                } else if (parentesis >= 1) {
                    parentAux.operacion(pantalla.getText(), "ln");
                    pantalla.setText(parentAux.realizarOperacion(""));
                    parentAux.limpiar();
                }

            }
        } else {
            FormulaIncoherente hola = new FormulaIncoherente("ln no puede operar sobre esta fórmula");
            hola.setVisible(true);
        }
        pantalla.requestFocus();

    }//GEN-LAST:event_jbTanActionPerformed

    private void jbRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTanActionPerformed
        if (lastSymbol.equals("num")) {
            if (!pantalla.getText().isEmpty()) {

                stringFormula = stringFormula + "sqrt";
                existePunto = false;
                lastSymbol = "num"; //es inmediato, con lo que es como si hubiese un num
                if (parentesis == 0) {
                    if (calculadora.op.isEmpty()) {
                        calculadora.operacion(pantalla.getText(), "raiz");
                        pantalla.setText(calculadora.realizarOperacion(""));
                        calculadora.limpiar();
                    } else {
                        calculadora.auxCalc2.operacion(pantalla.getText(), "raiz");
                        pantalla.setText(calculadora.auxCalc2.realizarOperacion(""));
                        calculadora.auxCalc2.limpiar();
                    }
                } else if (parentesis >= 1) {
                    parentAux.operacion(pantalla.getText(), "raiz");
                    pantalla.setText(parentAux.realizarOperacion(""));
                    parentAux.limpiar();
                }
            }
        } else {
            FormulaIncoherente hola = new FormulaIncoherente("raiz no puede operar sobre esta fórmula");
            hola.setVisible(true);
        }
        pantalla.requestFocus();

    }//GEN-LAST:event_jbTanActionPerformed

    private void jbSenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTanActionPerformed
        if (lastSymbol.equals("num")) {
            if (!pantalla.getText().isEmpty()) {
                stringFormula = stringFormula + "sin";
                existePunto = false;
                lastSymbol = "num"; //es inmediato, con lo que es como si hubiese un num
                if (parentesis == 0) {
                    if (calculadora.op.isEmpty()) {
                        calculadora.operacion(pantalla.getText(), "sin");
                        pantalla.setText(calculadora.realizarOperacion(""));
                        calculadora.limpiar();
                    } else {
                        calculadora.auxCalc2.operacion(pantalla.getText(), "sin");
                        pantalla.setText(calculadora.auxCalc2.realizarOperacion(""));
                        calculadora.auxCalc2.limpiar();
                    }
                } else if (parentesis >= 1) {
                    parentAux.operacion(pantalla.getText(), "sin");
                    pantalla.setText(parentAux.realizarOperacion(""));
                    parentAux.limpiar();
                }
            }
        } else {
            FormulaIncoherente hola = new FormulaIncoherente("sin no puede operar sobre esta fórmula");
            hola.setVisible(true);
        }
        pantalla.requestFocus();

    }//GEN-LAST:event_jbTanActionPerformed

    private void jbCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTanActionPerformed
        if (lastSymbol.equals("num")) {
            if (!pantalla.getText().isEmpty()) {
                stringFormula = stringFormula + "cos";
                existePunto = false;
                lastSymbol = "num"; //es inmediato, con lo que es como si hubiese un num
                if (parentesis == 0) {
                    if (calculadora.op.isEmpty()) {
                        calculadora.operacion(pantalla.getText(), "cos");
                        pantalla.setText(calculadora.realizarOperacion(""));
                        calculadora.limpiar();
                    } else {
                        calculadora.auxCalc2.operacion(pantalla.getText(), "cos");
                        pantalla.setText(calculadora.auxCalc2.realizarOperacion(""));
                        calculadora.auxCalc2.limpiar();
                    }
                } else if (parentesis >= 1) {
                    parentAux.operacion(pantalla.getText(), "cos");
                    pantalla.setText(parentAux.realizarOperacion(""));
                    parentAux.limpiar();
                }
            }
        } else {
            FormulaIncoherente hola = new FormulaIncoherente("cos no puede operar sobre esta fórmula");
            hola.setVisible(true);
        }
        pantalla.requestFocus();

    }//GEN-LAST:event_jbTanActionPerformed

    private void jbiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTanActionPerformed
        if (lastSymbol.equals("num")) {
            if (!pantalla.getText().isEmpty()) {

                stringFormula = stringFormula + "inv";
                existePunto = false;
                lastSymbol = "num"; //es inmediato, con lo que es como si hubiese un num
                if (parentesis == 0) {
                    if (calculadora.op.isEmpty()) {
                        calculadora.operacion(pantalla.getText(), "1/x");
                        pantalla.setText(calculadora.realizarOperacion(""));
                        calculadora.limpiar();
                    } else {
                        calculadora.auxCalc2.operacion(pantalla.getText(), "1/x");
                        pantalla.setText(calculadora.auxCalc2.realizarOperacion(""));
                        calculadora.auxCalc2.limpiar();
                    }
                } else if (parentesis >= 1) {
                    parentAux.operacion(pantalla.getText(), "1/x");
                    pantalla.setText(parentAux.realizarOperacion(""));
                    parentAux.limpiar();
                }

            }
        } else {
            FormulaIncoherente hola = new FormulaIncoherente("invertir no puede operar sobre esta fórmula");
            hola.setVisible(true);
        }
        pantalla.requestFocus();

    }//GEN-LAST:event_jbTanActionPerformed

    private void jbCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTanActionPerformed
        if (lastSymbol.equals("num")) {
            if (!pantalla.getText().isEmpty()) {

                stringFormula = stringFormula + "^2";
                existePunto = false;
                lastSymbol = "num"; //es inmediato, con lo que es como si hubiese un num
                if (parentesis == 0) {
                    if (calculadora.op.isEmpty()) {
                        calculadora.operacion(pantalla.getText(), "x^2");
                        pantalla.setText(calculadora.realizarOperacion(""));
                        calculadora.limpiar();
                    } else {
                        calculadora.auxCalc2.operacion(pantalla.getText(), "x^2");
                        pantalla.setText(calculadora.auxCalc2.realizarOperacion(""));
                        calculadora.auxCalc2.limpiar();
                    }
                } else if (parentesis >= 1) {
                    parentAux.operacion(pantalla.getText(), "x^2");
                    pantalla.setText(parentAux.realizarOperacion(""));
                    parentAux.limpiar();
                }
            }
        } else {
            FormulaIncoherente hola = new FormulaIncoherente("^2 no puede operar sobre esta fórmula");
            hola.setVisible(true);
        }
        pantalla.requestFocus();

    }//GEN-LAST:event_jbTanActionPerformed

    private void jbCuboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTanActionPerformed
        if (lastSymbol.equals("num")) {
            if (!pantalla.getText().isEmpty()) {
                stringFormula = stringFormula + "^3";
                existePunto = false;
                lastSymbol = "num"; //es inmediato, con lo que es como si hubiese un num
                if (parentesis == 0) {
                    if (calculadora.op.isEmpty()) {
                        calculadora.operacion(pantalla.getText(), "x^3");
                        pantalla.setText(calculadora.realizarOperacion(""));
                        calculadora.limpiar();
                    } else {
                        calculadora.auxCalc2.operacion(pantalla.getText(), "x^3");
                        pantalla.setText(calculadora.auxCalc2.realizarOperacion(""));
                        calculadora.auxCalc2.limpiar();
                    }
                } else if (parentesis >= 1) {
                    parentAux.operacion(pantalla.getText(), "x^3");
                    pantalla.setText(parentAux.realizarOperacion(""));
                    parentAux.limpiar();
                }

            }
        } else {
            FormulaIncoherente hola = new FormulaIncoherente("^3 no puede operar sobre esta fórmula");
            hola.setVisible(true);
        }
        pantalla.requestFocus();

    }//GEN-LAST:event_jbTanActionPerformed

    private void jbLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTanActionPerformed
        if (lastSymbol.equals("num")) {
            if (!pantalla.getText().isEmpty()) {

                stringFormula = stringFormula + "log";
                existePunto = false;
                lastSymbol = "num"; //es inmediato, con lo que es como si hubiese un num
                if (parentesis == 0) {
                    if (calculadora.op.isEmpty()) {
                        calculadora.operacion(pantalla.getText(), "log");
                        pantalla.setText(calculadora.realizarOperacion(""));
                        calculadora.limpiar();
                    } else {
                        calculadora.auxCalc2.operacion(pantalla.getText(), "log");
                        pantalla.setText(calculadora.auxCalc2.realizarOperacion(""));
                        calculadora.auxCalc2.limpiar();
                    }
                } else if (parentesis >= 1) {
                    parentAux.operacion(pantalla.getText(), "log");
                    pantalla.setText(parentAux.realizarOperacion(""));
                    parentAux.limpiar();
                }

            }
        } else {
            FormulaIncoherente hola = new FormulaIncoherente("log no puede operar sobre esta fórmula");
            hola.setVisible(true);
        }
        pantalla.requestFocus();

    }//GEN-LAST:event_jbTanActionPerformed

    private void jbFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTanActionPerformed
        if (lastSymbol.equals("num")) {
            if (!pantalla.getText().isEmpty()) {

                stringFormula = stringFormula + "!";
                existePunto = false;
                lastSymbol = "num"; //es inmediato, con lo que es como si hubiese un num
                if (parentesis == 0) {
                    if (calculadora.op.isEmpty()) {
                        calculadora.operacion(pantalla.getText(), "!");
                        pantalla.setText(calculadora.realizarOperacion(""));
                        calculadora.limpiar();
                    } else {
                        calculadora.auxCalc2.operacion(pantalla.getText(), "!");
                        pantalla.setText(calculadora.auxCalc2.realizarOperacion(""));
                        calculadora.auxCalc2.limpiar();
                    }
                } else if (parentesis >= 1) {
                    parentAux.operacion(pantalla.getText(), "!");
                    pantalla.setText(parentAux.realizarOperacion(""));
                    parentAux.limpiar();
                }

            }
        } else {
            FormulaIncoherente hola = new FormulaIncoherente("factorial no puede operar sobre esta fórmula");
            hola.setVisible(true);
        }
        pantalla.requestFocus();

    }//GEN-LAST:event_jbTanActionPerformed

    private void jbElevadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTanActionPerformed
        if (!pantalla.getText().isEmpty()) {
            if (!lastSymbol.equals("num")) {
                FormulaIncoherente hola = new FormulaIncoherente("hay que elevar un número o factor");
                hola.setVisible(true);
            } else {
                lastSymbol = "^";
                existePunto = false;
                stringFormula = stringFormula + "^";

                if (parentesis >= 1) {
                    if (parentAux.op.isEmpty()) {
                        parentAux.operacion(pantalla.getText(), "^");
                    } else {
                        parentAux.auxCalc2.operacion(pantalla.getText(), "^");
                    }
                } else {
                    if (calculadora.op.isEmpty()) {
                        calculadora.operacion(pantalla.getText(), "^");
                    } else {
                        calculadora.auxCalc2.operacion(pantalla.getText(), "^");
                    }
                }
            }
        }
        pantalla.setText("");
        pantalla.requestFocus();
    }//GEN-LAST:event_jbTanActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
        lastSymbol = "num";
        stringFormula = stringFormula + "9";
        pantalla.setText(pantalla.getText() + "9");
        pantalla.requestFocus();
    }//GEN-LAST:event_boton9ActionPerformed

    private void botonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonResetActionPerformed
        pantalla.setText("");
        lastSymbol = "";
        stringFormula = "";
        parentesis = 0;
        calculadora.limpiar();
        calculadora.auxCalc3.limpiar();
        parentAux = calculadora.auxCalc3;
        existePunto = false;
        pantalla.requestFocus();
    }//GEN-LAST:event_botonResetActionPerformed

    private void botonResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonResActionPerformed
        if (!pantalla.getText().isEmpty() || lastSymbol.equals("(")) {
            if (lastSymbol.equals("num") || lastSymbol.equals("(")) {
                existePunto = false;
                lastSymbol = "-";
                stringFormula = stringFormula + "-";
                if (parentesis == 0) {
                    if (calculadora.op.isEmpty()) {
                        calculadora.operacion(pantalla.getText(), "-");
                    } else {
                        if (calculadora.auxCalc.op.isEmpty()) {

                            if (calculadora.auxCalc2.op == "^") {
                                calculadora.operacion(calculadora.realizarOperacion(calculadora.auxCalc2.realizarOperacion(pantalla.getText())), "-");
                            } else {
                                calculadora.operacion(calculadora.realizarOperacion(pantalla.getText()), "-");
                            }
                        } else {

                            if (calculadora.auxCalc2.op == "^") {
                                calculadora.operacion(calculadora.realizarOperacion(calculadora.auxCalc.realizarOperacion(calculadora.auxCalc2.realizarOperacion(pantalla.getText()))), "-");
                                calculadora.auxCalc.limpiar();
                            } else {
                                calculadora.operacion(calculadora.realizarOperacion(calculadora.auxCalc.realizarOperacion(pantalla.getText())), "-");
                                calculadora.auxCalc.limpiar();
                            }
                        }
                    }
                } else if (parentesis >= 1) {
                    if (parentAux.op.isEmpty()) {
                        if (pantalla.getText().isEmpty()) { //parentesis inicial
                            parentAux.operacion("0", "-");
                        } else {
                            parentAux.operacion(pantalla.getText(), "-");
                        }
                    } else {
                        if (parentAux.auxCalc.op.isEmpty()) {

                            if (parentAux.auxCalc2.op == "^") {
                                parentAux.operacion(parentAux.realizarOperacion(parentAux.auxCalc2.realizarOperacion(pantalla.getText())), "-");
                            } else {
                                parentAux.operacion(parentAux.realizarOperacion(pantalla.getText()), "-");
                            }
                        } else {

                            if (parentAux.auxCalc2.op == "^") {
                                parentAux.operacion(parentAux.realizarOperacion(parentAux.auxCalc.realizarOperacion(parentAux.auxCalc2.realizarOperacion(pantalla.getText()))), "-");
                                parentAux.auxCalc.limpiar();
                            } else {
                                parentAux.operacion(parentAux.realizarOperacion(parentAux.auxCalc.realizarOperacion(pantalla.getText())), "-");
                                parentAux.auxCalc.limpiar();
                            }
                        }
                    }

                }
            } else {
                FormulaIncoherente hola = new FormulaIncoherente("- no puede operar sobre esta fórmula");
                hola.setVisible(true);
            }
        } else {
            calculadora.operacion("0", "-");
            lastSymbol = "-";
        }
        pantalla.setText("");
        pantalla.requestFocus();
    }//GEN-LAST:event_botonResActionPerformed

    private void jbFraccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFraccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbFraccionActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        lastSymbol = "num";
        pantalla.setText(pantalla.getText() + "7");
        stringFormula = stringFormula + "7";
        pantalla.requestFocus();
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        lastSymbol = "num";
        pantalla.setText(pantalla.getText() + "8");
        pantalla.requestFocus();
        stringFormula = stringFormula + "8";
    }//GEN-LAST:event_boton8ActionPerformed

    private void botonReset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReset1ActionPerformed
        if (!pantalla.getText().isEmpty()) {
            String cadena = pantalla.getText();
            String borrado = cadena.substring(cadena.length() - 1, cadena.length());
            cadena = cadena.substring(0, cadena.length() - 1);
            pantalla.setText(cadena);
            stringFormula = stringFormula.substring(0, stringFormula.length() - 1);
            if (".".equals(borrado)) {
                existePunto = false;
            }
        }
        pantalla.requestFocus();
    }//GEN-LAST:event_botonReset1ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        lastSymbol = "num";
        stringFormula = stringFormula + "4";
        pantalla.setText(pantalla.getText() + "4");
        pantalla.requestFocus();
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        lastSymbol = "num";
        pantalla.setText(pantalla.getText() + "5");
        pantalla.requestFocus();
        stringFormula = stringFormula + "5";
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        lastSymbol = "num";
        pantalla.setText(pantalla.getText() + "6");
        pantalla.requestFocus();
        stringFormula = stringFormula + "6";
    }//GEN-LAST:event_boton6ActionPerformed

    private void botonParenIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonParenIActionPerformed
        if (lastSymbol == "num") {
            FormulaIncoherente hola = new FormulaIncoherente("Parentesis no puede ir detras de número sin símbolo");
            hola.setVisible(true);
        } else {
            pantalla.setText("");
            lastSymbol = "(";
            parentesis += 1;
            pantalla.setText("");
            pantalla.requestFocus();
            stringFormula = stringFormula + "(";
            Datos parentAux2;
            if (parentesis > 1) {
                parentAux2 = parentAux;
                parentAux.auxCalc3.limpiar();
                parentAux = parentAux.auxCalc3;
                parentAux.parenAnt = parentAux2;
            }
        }
    }//GEN-LAST:event_botonParenIActionPerformed

    private void botonParenDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonParenDActionPerformed
        lastSymbol = "num"; // al cerrar el parentesis calcularemos su contenido, un numero
        if (parentesis < 1) {
            FormulaIncoherente hola = new FormulaIncoherente("')' inválido, no hay suficientes '('");
            hola.setVisible(true);
        } else {
            stringFormula = stringFormula + ")";
            parentesis -= 1;
            if (parentAux.auxCalc.op.isEmpty()) {
                if (parentAux.auxCalc2.op.isEmpty()) {

                    if (parentAux.op.isEmpty()) {
                        parentAux.operacion(pantalla.getText(), "+");
                        pantalla.setText(parentAux.realizarOperacion("0"));
                    } else {
                        pantalla.setText(parentAux.realizarOperacion(pantalla.getText()));
                    }
                } else {
                    pantalla.setText(parentAux.realizarOperacion(parentAux.auxCalc2.realizarOperacion(pantalla.getText())));

                }
            } else {
                if (parentAux.auxCalc2.op.isEmpty()) {
                    pantalla.setText(parentAux.realizarOperacion(parentAux.auxCalc.realizarOperacion(pantalla.getText())));
                } else {
                    pantalla.setText(parentAux.realizarOperacion(parentAux.auxCalc.realizarOperacion(parentAux.auxCalc2.realizarOperacion(pantalla.getText()))));
                }
            }
            pantalla.requestFocus();
            parentAux.limpiar();
            if (parentesis > 0) {
                parentAux = parentAux.parenAnt;

            }
        }
    }//GEN-LAST:event_botonParenDActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        lastSymbol = "num";
        pantalla.setText(pantalla.getText() + "1");
        pantalla.requestFocus();
        stringFormula = stringFormula + "1";
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        lastSymbol = "num";
        pantalla.setText(pantalla.getText() + "2");
        pantalla.requestFocus();
        stringFormula = stringFormula + "2";
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        lastSymbol = "num";
        pantalla.setText(pantalla.getText() + "3");
        pantalla.requestFocus();
        stringFormula = stringFormula + "3";
    }//GEN-LAST:event_boton3ActionPerformed

    private void botonMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMultActionPerformed
        if (!pantalla.getText().isEmpty()) {
            if (!lastSymbol.equals("num")) {
                FormulaIncoherente hola = new FormulaIncoherente("* no puede operar sobre esta fórmula");
                hola.setVisible(true);
            } else {
                stringFormula = stringFormula + "*";
                existePunto = false;
                lastSymbol = "*";
                if (parentesis >= 1) {

                    if (parentAux.op.isEmpty()) {
                        parentAux.operacion(pantalla.getText(), "*");
                    } else {
                        if (parentAux.auxCalc.op.isEmpty()) {
                            if (parentAux.op == "*" || parentAux.op == "/") {
                                if (parentAux.auxCalc2.op == "^") {
                                    parentAux.operacion(parentAux.realizarOperacion(parentAux.auxCalc2.realizarOperacion(pantalla.getText())), "*");
                                } else {
                                    parentAux.operacion(parentAux.realizarOperacion(pantalla.getText()), "*");
                                }
                            } else {
                                if (parentAux.auxCalc2.op == "^") {
                                } else {
                                    if (parentAux.auxCalc2.op == "^") {
                                        parentAux.auxCalc.operacion(parentAux.auxCalc2.realizarOperacion(pantalla.getText()), "*");
                                    } else {
                                        parentAux.auxCalc.operacion(pantalla.getText(), "*");
                                    }
                                }
                            }
                        } else {
                            if (parentAux.auxCalc2.op == "^") {
                                parentAux.auxCalc.operacion(parentAux.auxCalc.realizarOperacion(parentAux.auxCalc2.realizarOperacion(pantalla.getText())), "*");
                            } else {
                                parentAux.auxCalc.operacion(parentAux.auxCalc.realizarOperacion(pantalla.getText()), "*");
                            }
                        }
                    }
                } else {
                    if (calculadora.op.isEmpty()) {
                        calculadora.operacion(pantalla.getText(), "*");
                    } else {
                        if (calculadora.auxCalc.op.isEmpty()) {
                            if (calculadora.op == "*" || calculadora.op == "/") {
                                if (calculadora.auxCalc2.op == "^") {
                                    calculadora.operacion(calculadora.realizarOperacion(calculadora.auxCalc2.realizarOperacion(pantalla.getText())), "*");
                                } else {
                                    calculadora.operacion(calculadora.realizarOperacion(pantalla.getText()), "*");
                                }
                            } else {
                                if (calculadora.auxCalc2.op == "^") {
                                } else {
                                    if (calculadora.auxCalc2.op == "^") {
                                        calculadora.auxCalc.operacion(calculadora.auxCalc2.realizarOperacion(pantalla.getText()), "*");
                                    } else {
                                        calculadora.auxCalc.operacion(pantalla.getText(), "*");
                                    }
                                }
                            }
                        } else {
                            if (calculadora.auxCalc2.op == "^") {
                                calculadora.auxCalc.operacion(calculadora.auxCalc.realizarOperacion(calculadora.auxCalc2.realizarOperacion(pantalla.getText())), "*");
                            } else {
                                calculadora.auxCalc.operacion(calculadora.auxCalc.realizarOperacion(pantalla.getText()), "*");
                            }
                        }
                    }
                }
            }
        } else {
            FormulaIncoherente hola = new FormulaIncoherente("* no puede operar, ya que no hay nada sobre lo que operar");
            hola.setVisible(true);
        }
        pantalla.setText("");
        pantalla.requestFocus();
    }//GEN-LAST:event_botonMultActionPerformed

    private void botonDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDivActionPerformed
        if (!pantalla.getText().isEmpty()) {
            if (!lastSymbol.equals("num")) {
                FormulaIncoherente hola = new FormulaIncoherente("/ no puede operar sobre esta fórmula");
                hola.setVisible(true);
            } else {
                existePunto = false;
                lastSymbol = "/";
                stringFormula = stringFormula + "/";
                if (parentesis >= 1) {

                    if (parentAux.op.isEmpty()) {
                        parentAux.operacion(pantalla.getText(), "/");
                    } else {
                        if (parentAux.auxCalc.op.isEmpty()) {
                            if (parentAux.op == "*" || parentAux.op == "/") {
                                if (parentAux.auxCalc2.op == "^") {
                                    parentAux.operacion(parentAux.realizarOperacion(parentAux.auxCalc2.realizarOperacion(pantalla.getText())), "/");
                                } else {
                                    parentAux.operacion(parentAux.realizarOperacion(pantalla.getText()), "/");
                                }
                            } else {
                                if (parentAux.auxCalc2.op == "^") {
                                } else {
                                    if (parentAux.auxCalc2.op == "^") {
                                        parentAux.auxCalc.operacion(parentAux.auxCalc2.realizarOperacion(pantalla.getText()), "/");
                                    } else {
                                        parentAux.auxCalc.operacion(pantalla.getText(), "/");
                                    }
                                }
                            }
                        } else {
                            if (parentAux.auxCalc2.op == "^") {
                                parentAux.auxCalc.operacion(parentAux.auxCalc.realizarOperacion(parentAux.auxCalc2.realizarOperacion(pantalla.getText())), "/");
                            } else {
                                parentAux.auxCalc.operacion(parentAux.auxCalc.realizarOperacion(pantalla.getText()), "/");
                            }
                        }
                    }
                } else {
                    if (calculadora.op.isEmpty()) {
                        calculadora.operacion(pantalla.getText(), "/");
                    } else {
                        if (calculadora.auxCalc.op.isEmpty()) {
                            if (calculadora.op == "*" || calculadora.op == "/") {
                                if (calculadora.auxCalc2.op == "^") {
                                    calculadora.operacion(calculadora.realizarOperacion(calculadora.auxCalc2.realizarOperacion(pantalla.getText())), "/");
                                } else {
                                    calculadora.operacion(calculadora.realizarOperacion(pantalla.getText()), "/");
                                }
                            } else {
                                if (calculadora.auxCalc2.op == "^") {
                                } else {
                                    if (calculadora.auxCalc2.op == "^") {
                                        calculadora.auxCalc.operacion(calculadora.auxCalc2.realizarOperacion(pantalla.getText()), "/");
                                    } else {
                                        calculadora.auxCalc.operacion(pantalla.getText(), "/");
                                    }
                                }
                            }
                        } else {
                            if (calculadora.auxCalc2.op == "^") {
                                calculadora.auxCalc.operacion(calculadora.auxCalc.realizarOperacion(calculadora.auxCalc2.realizarOperacion(pantalla.getText())), "/");
                            } else {
                                calculadora.auxCalc.operacion(calculadora.auxCalc.realizarOperacion(pantalla.getText()), "/");
                            }
                        }
                    }
                }
            }
        } else {
            FormulaIncoherente hola = new FormulaIncoherente("/ no puede operar, ya que no hay nada sobre lo que operar");
            hola.setVisible(true);
        }
        pantalla.setText("");
        pantalla.requestFocus();
    }//GEN-LAST:event_botonDivActionPerformed

    private void boton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0ActionPerformed
        lastSymbol = "num";
        pantalla.setText(pantalla.getText() + "0");
        pantalla.requestFocus();
        stringFormula = stringFormula + "0";
    }//GEN-LAST:event_boton0ActionPerformed

    private void botonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPuntoActionPerformed
        String aux = pantalla.getText();
        lastSymbol = "num";
        stringFormula = stringFormula + ".";
        if (aux.isEmpty()) {
            pantalla.setText("0.");
            existePunto = true;
        } else if (existePunto == true) {

        } else {
            pantalla.setText(aux + ".");
            existePunto = true;
        }
        pantalla.requestFocus();
    }//GEN-LAST:event_botonPuntoActionPerformed

    private void botonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIgualActionPerformed
        if (!pantalla.getText().isEmpty()) {
            if (parentesis != 0) {
                FormulaIncoherente hola = new FormulaIncoherente("parentesis no cerrados");
                hola.setVisible(true);
            } else {
                existePunto = false;
                if (calculadora.auxCalc.op.isEmpty()) {
                    if (calculadora.auxCalc2.op.isEmpty()) {
                        if (calculadora.op.isEmpty()) {
                            calculadora.operacion(pantalla.getText(), "+");
                            pantalla.setText(calculadora.realizarOperacion("0"));
                        } else {
                            pantalla.setText(calculadora.realizarOperacion(pantalla.getText()));
                        }
                    } else {
                        pantalla.setText(calculadora.realizarOperacion(calculadora.auxCalc2.realizarOperacion(pantalla.getText())));

                    }
                } else {
                    if (calculadora.auxCalc2.op.isEmpty()) {
                        pantalla.setText(calculadora.realizarOperacion(calculadora.auxCalc.realizarOperacion(pantalla.getText())));
                    } else {
                        pantalla.setText(calculadora.realizarOperacion(calculadora.auxCalc.realizarOperacion(calculadora.auxCalc2.realizarOperacion(pantalla.getText()))));
                    }
                }
            }
        }
        pantalla.requestFocus();
        lastSymbol = "num";
        parentesis = 0;
        calculadora.limpiar();
        calculadora.auxCalc3.limpiar();
        operacionActual hola = new operacionActual(stringFormula);
        hola.setLocationRelativeTo(this);
        hola.setVisible(true);
        stringFormula = pantalla.getText();
    }//GEN-LAST:event_botonIgualActionPerformed

    private void botonSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSumActionPerformed
        if (!pantalla.getText().isEmpty() || lastSymbol.equals("(")) {
            if (lastSymbol.equals("num") || lastSymbol.equals("(")) {
                existePunto = false;
                lastSymbol = "+";
                stringFormula = stringFormula + "+";
                if (parentesis == 0) {
                    if (calculadora.op.isEmpty()) {
                        calculadora.operacion(pantalla.getText(), "+");
                    } else {
                        if (calculadora.auxCalc.op.isEmpty()) {

                            if (calculadora.auxCalc2.op == "^") {
                                calculadora.operacion(calculadora.realizarOperacion(calculadora.auxCalc2.realizarOperacion(pantalla.getText())), "+");
                            } else {
                                calculadora.operacion(calculadora.realizarOperacion(pantalla.getText()), "+");
                            }
                        } else {

                            if (calculadora.auxCalc2.op == "^") {
                                calculadora.operacion(calculadora.realizarOperacion(calculadora.auxCalc.realizarOperacion(calculadora.auxCalc2.realizarOperacion(pantalla.getText()))), "+");
                                calculadora.auxCalc.limpiar();
                            } else {
                                calculadora.operacion(calculadora.realizarOperacion(calculadora.auxCalc.realizarOperacion(pantalla.getText())), "+");
                                calculadora.auxCalc.limpiar();
                            }
                        }
                    }
                } else if (parentesis >= 1) {
                    if (parentAux.op.isEmpty()) {
                        if (pantalla.getText().isEmpty()) { //parentesis inicial
                            parentAux.operacion("0", "+");
                        } else {
                            parentAux.operacion(pantalla.getText(), "+");
                        }
                    } else {
                        if (parentAux.auxCalc.op.isEmpty()) {

                            if (parentAux.auxCalc2.op == "^") {
                                parentAux.operacion(parentAux.realizarOperacion(parentAux.auxCalc2.realizarOperacion(pantalla.getText())), "+");
                            } else {
                                parentAux.operacion(parentAux.realizarOperacion(pantalla.getText()), "+");
                            }
                        } else {

                            if (parentAux.auxCalc2.op == "^") {
                                parentAux.operacion(parentAux.realizarOperacion(parentAux.auxCalc.realizarOperacion(parentAux.auxCalc2.realizarOperacion(pantalla.getText()))), "+");
                                parentAux.auxCalc.limpiar();
                            } else {
                                parentAux.operacion(parentAux.realizarOperacion(parentAux.auxCalc.realizarOperacion(pantalla.getText())), "+");
                                parentAux.auxCalc.limpiar();
                            }
                        }
                    }

                }
            } else {
                FormulaIncoherente hola = new FormulaIncoherente("+ no puede aplicarse a esta fórmula");
                hola.setVisible(true);
            }
        } else {
            calculadora.operacion("0", "+");
            lastSymbol = "+";
        }
        pantalla.setText("");
        pantalla.requestFocus();
    }//GEN-LAST:event_botonSumActionPerformed

    private void botonAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAyudaActionPerformed
        Ayuda ayuda = new Ayuda();
        ayuda.setVisible(true);
    }//GEN-LAST:event_botonAyudaActionPerformed

    private void pantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pantallaActionPerformed
        botonIgual.doClick();
    }//GEN-LAST:event_pantallaActionPerformed

    private void jbOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOnActionPerformed
        botonOperacion.setVisible(true);
        jbOn.setVisible(false);
        jbOff.setVisible(true);
        pantalla.setVisible(true);
        boton9.setVisible(true);
        boton8.setVisible(true);
        boton7.setVisible(true);
        boton6.setVisible(true);
        boton5.setVisible(true);
        boton4.setVisible(true);
        boton3.setVisible(true);
        boton2.setVisible(true);
        boton1.setVisible(true);
        boton0.setVisible(true);
        jbSen.setVisible(true);
        jbCos.setVisible(true);
        jbTan.setVisible(true);
        jbLn.setVisible(true);
        jbCuadrado.setVisible(true);
        jbCubo.setVisible(true);
        jbCubo.setVisible(true);
        jbFactorial.setVisible(true);
        jbLog.setVisible(true);
        jbi.setVisible(true);
        jbRaiz.setVisible(true);
        jbElevado.setVisible(true);
        jbFraccion.setVisible(true);
        botonReset.setVisible(true);
        botonReset1.setVisible(true);
        botonParenD.setVisible(true);
        botonParenI.setVisible(true);
        botonMult.setVisible(true);
        botonDiv.setVisible(true);
        botonPunto.setVisible(true);
        botonIgual.setVisible(true);
        botonSum.setVisible(true);
        botonRes.setVisible(true);
        botonAyuda.setVisible(true);
    }//GEN-LAST:event_jbOnActionPerformed

    @SuppressWarnings("unchecked")
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton0;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton botonAyuda;
    private javax.swing.JButton botonDiv;
    private javax.swing.JButton botonIgual;
    private javax.swing.JButton botonMult;
    private javax.swing.JButton botonParenD;
    private javax.swing.JButton botonParenI;
    private javax.swing.JButton botonPunto;
    private javax.swing.JButton botonRes;
    private javax.swing.JButton botonReset;
    private javax.swing.JButton botonReset1;
    private javax.swing.JButton botonSum;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbCos;
    private javax.swing.JButton jbCuadrado;
    private javax.swing.JButton jbCubo;
    private javax.swing.JButton jbElevado;
    private javax.swing.JButton jbFactorial;
    private javax.swing.JButton jbFraccion;
    private javax.swing.JButton jbLn;
    private javax.swing.JButton jbLog;
    private javax.swing.JButton jbOff;
    private javax.swing.JButton jbOn;
    private javax.swing.JButton jbRaiz;
    private javax.swing.JButton jbSen;
    private javax.swing.JButton jbTan;
    private javax.swing.JButton jbi;
    private javax.swing.JTextField pantalla;
    private javax.swing.JButton botonOperacion;
    // End of variables declaration//GEN-END:variables
}
