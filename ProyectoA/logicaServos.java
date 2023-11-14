
package proyecto;

import jssc.SerialPort;
import jssc.SerialPortException;
//import javax.swing.JOptionPane;
import java.util.Scanner;

public class logicaServos {
    private final SerialPort serialPort;

    public logicaServos(String puerto) {
        serialPort = new SerialPort(puerto);
    }

    public void iniciar() {
        try {
            serialPort.openPort();
            serialPort.setParams(SerialPort.BAUDRATE_9600,SerialPort.DATABITS_8,SerialPort.STOPBITS_1,SerialPort.PARITY_NONE);

            try (Scanner scanner = new Scanner(System.in)) {
                String input;
                
                do {
                    System.out.println("Ingresa los grados en el eje X o q para salir");
                    input = scanner.nextLine();
                    
                    if (!input.equalsIgnoreCase("q")) {
                        try {
                            int gradosServoX = Integer.parseInt(input);
                            
                            if (gradosServoX >= 0 && gradosServoX <= 180) {
                                System.out.println("Ingresa los grados en el eje Y:");
                                int gradosServoY = Integer.parseInt(scanner.nextLine());
                                
                                if (gradosServoY >= 0 && gradosServoY <= 180) {
                                    enviarGrados(gradosServoX, gradosServoY);
                                } else {
                                    System.out.println("Ingresa un valor entre 0 y 180 para el eje Y.");
                                    //JOptionPane.showMessageDialog(null, "Ingresa\nun\nvalor\nentre\n0\ny\n180.");
                                }
                            } else {
                                System.out.println("Ingresa un valor entre 0 y 180 para el eje X.");
                                //JOptionPane.showMessageDialog(null, "Ingresa\nun\nvalor\nentre\n0\ny\n180.");
                            }
                        } catch (NumberFormatException e) {
                            /*JOptionPane.showMessageDialog(null,"Ingresa\nun\nnúmero\nválido.");*/
                            System.out.println("Ingresa un número válido.");
                        }
                    }
                } while (!input.equalsIgnoreCase("q"));
            }
            serialPort.closePort();

        } catch (SerialPortException e) {
        }
    }

    private void enviarGrados(int gradosServo1, int gradosServo2) {
        try {
            serialPort.writeString(gradosServo1 + "," + gradosServo2);
        } catch (SerialPortException e) {
        }
    }
}

    

    

    
   
