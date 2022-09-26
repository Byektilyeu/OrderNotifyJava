package com.rkeepermn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertApp {

    static final String userDirectory = System.getProperty("user.dir");

    public Connection connect() {
        String url = "jdbc:sqlite:" + userDirectory + "\\voice.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void insert(Integer visit, String qmsNumber, String kdsState, Boolean voiceState, String preState, String guid) {
        String sql = "INSERT INTO orders(visit, qmsNumber, kdsState, voiceState, preState, guid) VALUES(?,?,?,?,?,?)";
        try (Connection conn = this.connect();
             PreparedStatement pstmt = connect().prepareStatement(sql)) {
            pstmt.setInt(1, visit);
            pstmt.setString(2, qmsNumber);
            pstmt.setString(3, kdsState);
            pstmt.setBoolean(4, voiceState);
            pstmt.setString(5, preState);
            pstmt.setString(6, guid);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}