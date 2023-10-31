import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraGUI extends JFrame {
    private JTextField num1Field, num2Field, resultField;
    private JButton sumButton, subtractButton, multiplyButton, divideButton;

    public CalculadoraGUI() {
        setTitle("Calculadora");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 10, 10)); // 5 filas, 2 columnas, espaciado de 10 píxeles.

        JLabel num1Label = new JLabel("Número 1:");
        num1Field = new JTextField(10);

        JLabel num2Label = new JLabel("Número 2:");
        num2Field = new JTextField(10);

        JLabel resultLabel = new JLabel("Resultado:");
        resultField = new JTextField(10);
        resultField.setEditable(false);

        sumButton = new JButton("Sumar");
        subtractButton = new JButton("Restar");
        multiplyButton = new JButton("Multiplicar");
        divideButton = new JButton("Dividir");

        sumButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                realizarOperacion("+");
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                realizarOperacion("-");
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                realizarOperacion("*");
            }
        });

        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                realizarOperacion("/");
            }
        });

        panel.add(resultLabel);
        panel.add(resultField);
        panel.add(num1Label);
        panel.add(num1Field);
        panel.add(num2Label);
        panel.add(num2Field);
        panel.add(sumButton);
        panel.add(subtractButton);
        panel.add(multiplyButton);
        panel.add(divideButton);

        add(panel);
    }

    private void realizarOperacion(String operador) {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double resultado = 0;

            switch (operador) {
                case "+":
                    resultado = num1 + num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        JOptionPane.showMessageDialog(this, "No se puede dividir por cero.");
                        return;
                    }
                    break;
            }

            resultField.setText(String.valueOf(resultado));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese números válidos.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculadoraGUI calculator = new CalculadoraGUI();
            calculator.setVisible(true);
        });
    }
}
