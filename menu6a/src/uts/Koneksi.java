package uts;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Koneksi {

    private static String uname = "root";
    private static String pass = "";
    private static String url = "jdbc:mysql://localhost:3306/dbtransaksi";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, uname, pass);
    }
    public static void main(String[] args) throws SQLException {
        try {
            getConnection();
            System.out.println("Koneksi berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
