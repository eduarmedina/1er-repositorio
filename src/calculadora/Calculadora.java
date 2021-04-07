/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JOptionPane;


public class Calculadora {
//variables
    int numero1,numero2;
    int suma;
    int restar ;
    int multiplicar;
    int dividir ;
    //metodos
    public void leernumeros(){
        numero1=Integer.parseInt(JOptionPane.showInputDialog("digite el primer numero"));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("digite el segundo numero"));
    }
    public void sumar(){
        suma=numero1+numero2;
    }
    
    public void restar(){
        restar=numero1-numero2;
    }
    
    public void multiplicar(){
        multiplicar=numero1*numero2;
    }
    
    public void dividir(){
        dividir=numero1/numero2;
    }
    public void mostrar(){
        JOptionPane.showMessageDialog(null," "+suma,"SUMA (+)",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null," "+restar,"RESTA (-)  ",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null," "+multiplicar,"MULTIPLICACION (*) ",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null," "+dividir,"DIVISIÓN (/)",JOptionPane.INFORMATION_MESSAGE);

    }
    public static void main(String[] args) {
        Calculadora op=new Calculadora();
        op.leernumeros();
        op.sumar();
        op.restar();
        op.multiplicar();
        op.dividir();
        op.mostrar();
        
    }
    
}
