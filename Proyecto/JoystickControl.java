/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import gnu.io.CommPortIdentifier;
import gnu.io.NoSuchPortException;
import gnu.io.PortInUseException;
import gnu.io.SerialPort;
import gnu.io.UnsupportedCommOperationException;
import java.io.IOException;
import java.io.OutputStream;

public class JoystickControl {

    public static void main(String[] args) {
        try {
            // Configura la conexión serie
            String portName = "COM3"; // Cambia el puerto serial según tu configuración
            int baudRate = 9600;
            CommPortIdentifier portIdentifier = CommPortIdentifier.getPortIdentifier(portName);
            if (portIdentifier.isCurrentlyOwned()) {
                System.out.println("El puerto ya está en uso");
            } else {
                SerialPort serialPort = (SerialPort) portIdentifier.open("JoystickControl", 2000);
                serialPort.setSerialPortParams(baudRate, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);

                OutputStream outputStream = serialPort.getOutputStream();

                while (true) {
                    // Leer los valores del joystick
                    // Puedes utilizar una biblioteca para la lectura del joystick (por ejemplo, JInput) o leer los valores desde un puerto analógico del hardware.

                    int xValue = obtenerValorJoystickEjeX(); // Reemplaza con la lectura real del joystick
                    int yValue = obtenerValorJoystickEjeY(); // Reemplaza con la lectura real del joystick

                    // Enviar los valores al Arduino
                    outputStream.write(xValue & 0xFF);
                    outputStream.write((xValue >> 8) & 0xFF);
                    outputStream.write(yValue & 0xFF);
                    outputStream.write((yValue >> 8) & 0xFF);
                }
            }
        } catch (NoSuchPortException | PortInUseException | UnsupportedCommOperationException | IOException e) {
        }
    }

    // Funciones para obtener los valores del joystick (simulación)
    private static int obtenerValorJoystickEjeX() {
        // Simula la lectura del joystick en el eje X (rango 0-1023)
        return (int) (Math.random() * 1024);
    }

    private static int obtenerValorJoystickEjeY() {
        // Simula la lectura del joystick en el eje Y (rango 0-1023)
        return (int) (Math.random() * 1024);
    }
}