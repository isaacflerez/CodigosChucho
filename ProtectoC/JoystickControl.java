



package proyecto;

import jssc.SerialPort;
import jssc.SerialPortException;

public class JoystickControl {
    public static void main(String[] args) {
        SerialPort serialPort = new SerialPort("COM1"); 
        try {
            serialPort.openPort();
            serialPort.setParams(9600, 8, 1, 0);

            while (true) {
                String data = serialPort.readString();
                if (data != null) {
                    String[] values = data.trim().split(",");
                    if (values.length == 2) {
                        int joyX = Integer.parseInt(values[0]);
                        int joyY = Integer.parseInt(values[1]);

                       

                        System.out.println("Joystick X: " + joyX + ", Joystick Y: " + joyY);
                    }
                }
            }
        } catch (SerialPortException ex) {
            System.out.println("Error: " + ex);
        }
    }
}
