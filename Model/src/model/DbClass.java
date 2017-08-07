package model;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import oracle.jdbc.OracleDriver;

public class DbClass {
    public static Connection connect() throws SQLException {
        String u1 = "center";
        String p1 = "center";
        String t1 = "jdbc:oracle:thin:@localhost:1521:xe";
        Driver d = new OracleDriver();
        Connection conn = DriverManager.getConnection(t1, u1, p1);
        conn.setAutoCommit(true);
        return conn;
    }


    public void exeSql(String sq) {
        DbClass db = new DbClass();
        Connection con;

        int rs = 0;
        try {
            con = db.connect();
            PreparedStatement st = con.prepareStatement(sq);
            rs = st.executeUpdate();


        } catch (SQLException f) {
            JOptionPane.showMessageDialog(null, "Not Connecte.:" + f.getMessage());
        }
    }


    public int check(String sq) {
        DbClass db = new DbClass();
        Connection con;
        int ff = 0;
        ResultSet rs = null;
        try {
            con = db.connect();
            PreparedStatement st = con.prepareStatement(sq);
            rs = st.executeQuery();
            if (rs.next())
                ff = 1;
            else
                ff = 0;

        } catch (SQLException f) {
            JOptionPane.showMessageDialog(null, "Not Connecte.:" + f.getMessage());
        }
        return ff;

    }


    public ResultSet exeSelect(String sq) {
        DbClass db = new DbClass();
        Connection con;

        ResultSet rs = null;
        try {
            con = db.connect();
            PreparedStatement st = con.prepareStatement(sq);
            rs = st.executeQuery();


        } catch (SQLException f) {
            JOptionPane.showMessageDialog(null, "Not Connecte.:" + f.getMessage());
        }
        return rs;

    }

}
