package hojadetrabajo2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author alexi
 */
public class HojadeTrabajo2 extends JFrame implements ActionListener {

    public static int num1 = 0;
    public static int operacion = 0;
    public JTextField CuadroText = new JTextField();
    public JButton suma = new JButton("+");
    public JButton resta = new JButton("-");
    public JButton multiplicacion = new JButton("*");
    public JButton division = new JButton("/");
    public JButton parentesis = new JButton("()");
    public JButton resultado = new JButton("=");
    public JButton uno = new JButton("1");
    public JButton dos = new JButton("2");
    public JButton tres = new JButton("3");
    public JButton cuatro = new JButton("4");
    public JButton cinco = new JButton("5");
    public JButton seis = new JButton("6");
    public JButton siete = new JButton("7");
    public JButton ocho = new JButton("8");
    public JButton nueve = new JButton("9");
    public JButton cero = new JButton("0");

    public HojadeTrabajo2() {
        CuadroText.setBounds(0, 0, 300, 100);
        suma.setBounds(0, 100, 75, 75);
        resta.setBounds(75, 100, 75, 75);
        multiplicacion.setBounds(150, 100, 75, 75);
        division.setBounds(225, 175, 75, 75);
        parentesis.setBounds(225, 250, 75, 75);
        resultado.setBounds(225, 100, 75, 75);

        uno.setBounds(0, 175, 75, 75);
        dos.setBounds(75, 175, 75, 75);
        tres.setBounds(150, 175, 75, 75);
        cuatro.setBounds(0, 250, 75, 75);
        cinco.setBounds(75, 250, 75, 75);
        seis.setBounds(150, 250, 75, 75);
        siete.setBounds(0, 325, 75, 75);
        ocho.setBounds(75, 325, 75, 75);
        nueve.setBounds(150, 325, 75, 75);
        cero.setBounds(225, 325, 75, 75);

        suma.addActionListener(this);
        resta.addActionListener(this);
        multiplicacion.addActionListener(this);
        division.addActionListener(this);
        parentesis.addActionListener(this);
        resultado.addActionListener(this);
        uno.addActionListener(this);
        dos.addActionListener(this);
        tres.addActionListener(this);
        cuatro.addActionListener(this);
        cinco.addActionListener(this);
        seis.addActionListener(this);
        siete.addActionListener(this);
        ocho.addActionListener(this);
        nueve.addActionListener(this);
        cero.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 600, 400);
        panel.setLayout(null);
        this.add(suma);
        this.add(resta);
        this.add(multiplicacion);
        this.add(division);
        this.add(parentesis);
        this.add(CuadroText);
        this.add(resultado);
        this.add(uno);
        this.add(dos);
        this.add(tres);
        this.add(cuatro);
        this.add(cinco);
        this.add(seis);
        this.add(siete);
        this.add(ocho);
        this.add(nueve);
        this.add(cero);
        this.add(panel);
        this.setSize(300, 425);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public int opSuma() {
        String[] temp = CuadroText.getText().split("\\+");
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != null) {
                num1 = Integer.parseInt(temp[i]);
                operacion += num1;
                System.out.println(operacion);
                System.out.println(num1);
            }
        }
        return operacion;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == suma) {
            opSuma();
            int aux = num1;
            CuadroText.setText(aux + "+");
            
        }if (ae.getSource() == resultado) {
            CuadroText.setText(String.valueOf(operacion));
        }if (ae.getSource() == resta) {
            String temp = CuadroText.getText();
            CuadroText.setText(temp + "-");
        }if (ae.getSource() == multiplicacion) {
            String temp = CuadroText.getText();
            CuadroText.setText(temp + "*");
        }if (ae.getSource() == division) {
            String temp = CuadroText.getText();
            CuadroText.setText(temp + "/");
        }if (ae.getSource() == uno) {
            String temp = CuadroText.getText();
            CuadroText.setText(temp + "1");
        }if (ae.getSource() == dos) {
            String temp = CuadroText.getText();
            CuadroText.setText(temp + "2");
        }if (ae.getSource() == tres) {
            String temp = CuadroText.getText();
            CuadroText.setText(temp + "3");
        }if (ae.getSource() == cuatro) {
            String temp = CuadroText.getText();
            CuadroText.setText(temp + "4");
        }if (ae.getSource() == cinco) {
            String temp = CuadroText.getText();
            CuadroText.setText(temp + "5");
        }if (ae.getSource() == seis) {
            String temp = CuadroText.getText();
            CuadroText.setText(temp + "6");
        }if (ae.getSource() == siete) {
            String temp = CuadroText.getText();
            CuadroText.setText(temp + "7");
        }if (ae.getSource() == ocho) {
            String temp = CuadroText.getText();
            CuadroText.setText(temp + "8");
        }if (ae.getSource() == nueve) {
            String temp = CuadroText.getText();
            CuadroText.setText(temp + "9");
        }if (ae.getSource() == cero) {
            String temp = CuadroText.getText();
            CuadroText.setText(temp + "0");
        }
    }
}
