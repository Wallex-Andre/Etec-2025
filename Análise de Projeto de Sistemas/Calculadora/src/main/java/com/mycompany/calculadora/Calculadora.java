package com.mycompany.calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;

public class Calculadora extends JFrame {
    JLabel rotulo1, rotulo2, exibir;
    JTextField texto1, texto2;
    JButton somar, subtrair, multiplicacao, divisao, sair;
;
    public Calculadora(){
        super("Exemplo de soma");
        Container tela = getContentPane();
        tela.setBackground(new Color(135,206,250));
        setLayout(null);

        rotulo1 = new JLabel("1° Número: ");
        rotulo2 = new JLabel("2° Número: ");
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        exibir = new JLabel("");
        
        somar = new JButton("Somar");
        subtrair = new JButton("Subtrair");
        multiplicacao = new JButton("Multiplicacar");
        divisao = new JButton("Dividir");
        sair = new JButton("Sair");

        rotulo1.setBounds(19, 20, 100, 20);
        rotulo2.setBounds(19, 60, 100, 20);
        texto1.setBounds(100, 20, 420, 20);
        texto2.setBounds(100, 60, 420, 20);
        exibir.setBounds(19, 155, 200, 20);
        
        sair.setBounds(220, 170, 110, 50);
        
        somar.setBounds(19, 100, 110, 50);
        subtrair.setBounds(151, 100, 110, 50);
        multiplicacao.setBounds(283, 100, 110, 50);
        divisao.setBounds(415, 100, 110, 50);
        
        Color Cor = new Color(65,105,225);
        
        somar.setBackground(Cor);
        subtrair.setBackground(Cor);
        multiplicacao.setBackground(Cor);
        divisao.setBackground(Cor);
        
        sair.setBackground(Cor);
        
        Color LetraCor = (Color.white);
        
        somar.setForeground(LetraCor);
        subtrair.setForeground(LetraCor);
        multiplicacao.setForeground(LetraCor);
        divisao.setForeground(LetraCor);
        
        sair.setForeground(LetraCor);
  
        
        Font fonteBotao = new Font("Arial", Font.PLAIN, 13);
        
        somar.setFont(fonteBotao);
        subtrair.setFont(fonteBotao);
        multiplicacao.setFont(fonteBotao);
        divisao.setFont(fonteBotao);
        
        somar.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    double numero1, numero2, soma;
                    soma = 0;
                    numero1 = Integer.parseInt(texto1.getText());
                    numero2 = Integer.parseInt(texto2.getText());
                    soma = numero1 + numero2;
                    exibir.setVisible(true);
                    exibir.setText("A soma é: " + soma);
                }
            }
        );
        
        subtrair.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    double numero1, numero2, subtrair;
                    subtrair = 0;
                    numero1 = Integer.parseInt(texto1.getText());
                    numero2 = Integer.parseInt(texto2.getText());
                    subtrair = numero1 - numero2;
                    exibir.setVisible(true);
                    exibir.setText("A subtração é: " + subtrair);
                }
            }
        );
        
        multiplicacao.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    double numero1, numero2, multiplicacao;
                    multiplicacao = 0;
                    numero1 = Integer.parseInt(texto1.getText());
                    numero2 = Integer.parseInt(texto2.getText());
                    multiplicacao = numero1 * numero2;
                    exibir.setVisible(true);
                    exibir.setText("A multiplicação é: " + multiplicacao);
                }
            }
        );
        
        divisao.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    double numero1, numero2, soma;
                    soma = 0;
                    numero1 = Integer.parseInt(texto1.getText());
                    numero2 = Integer.parseInt(texto2.getText());
                    soma = numero1 / numero2;
                    exibir.setVisible(true);
                    exibir.setText("A divisão é: " + divisao);
                }
            }
        );

        sair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Encerra o programa
            }
        });

        exibir.setVisible(false);

        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(exibir);
        tela.add(somar);
        tela.add(subtrair);
        tela.add(multiplicacao);
        tela.add(divisao);
        tela.add(sair);

        setSize(555, 280);
        setVisible(true);
        }
    public static void main(String args[]){
        Calculadora app = new Calculadora();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}