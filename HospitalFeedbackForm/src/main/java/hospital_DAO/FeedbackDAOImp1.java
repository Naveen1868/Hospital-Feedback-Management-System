package hospital_DAO;

import hospital_Entity.FeedbackEntity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FeedbackDAOImp1 {
    private Connection conn;

    public FeedbackDAOImp1() {
        conn = FeedbackInstance.getInstance();
        System.out.println(" Connection inside DAO: " + conn);
    }

    public int insert(FeedbackEntity feedback) {
        int result = 0;

        try {
            if (conn == null) {
                System.out.println("Connection is NULL inside insert()");
                return 0;
            }

            PreparedStatement ps = conn.prepareStatement(
                "INSERT INTO feed (name, age, visit_date, city, department, staff_behaviour, cleanliness, overall_rating, additional_comments) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)"
            );

            ps.setString(1, feedback.getName());
            ps.setInt(2, feedback.getAge());
            ps.setDate(3, java.sql.Date.valueOf(feedback.getVisitDate()));
            ps.setString(4, feedback.getCity());
            ps.setString(5, feedback.getDepartment());
            ps.setString(6, feedback.getStaffBehaviour());
            ps.setString(7, feedback.getCleanliness());
            ps.setString(8, feedback.getOverallRating());
            ps.setString(9, feedback.getComments());

            result = ps.executeUpdate();
            ps.close();

            System.out.println("` Insert successful, rows affected: " + result);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
}
