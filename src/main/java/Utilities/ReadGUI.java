/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;
import javax.swing.JOptionPane;

/**
 *
 * @author zzxst
 */
public class ReadGUI {
    static String data = "";
    public static int readInt(String message) {
        int result;
        data = JOptionPane.showInputDialog(message);
        result = Integer.parseInt(data);
        return result;
    }
    public static String readString(String message) {
        data = JOptionPane.showInputDialog(message);
        return data;
    }
    public static float readFloat(String message) {
        float result;
        data = JOptionPane.showInputDialog(message);
        result = Float.parseFloat(data);
        return result;
    }
    public double readDouble(String message) {
        double result;
        data = JOptionPane.showInputDialog(message);
        result = Double.parseDouble(data);
        return result;
    }
    public static long readLong(String message) {
        long result;
        data = JOptionPane.showInputDialog(message);
        result = Long.parseLong(data);
        return result;
    }
    public static int readOptions(String message, String title, Object[] options){
        return JOptionPane.showOptionDialog(null, message,title,0 ,JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
    }
}
