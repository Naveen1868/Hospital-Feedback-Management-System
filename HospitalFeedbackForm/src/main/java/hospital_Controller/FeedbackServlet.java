package hospital_Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hospital_DAO.FeedbackDAOImp1;
import hospital_Entity.FeedbackEntity;

@WebServlet("/FeedbackServlet")
public class FeedbackServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        int result = 0;

        try {
            String name = request.getParameter("name");
            int age = Integer.parseInt(request.getParameter("age"));
            String visitDate = request.getParameter("visitDate");
            String city = request.getParameter("cityname");
            String[] departments = request.getParameterValues("department");
            String departmentStr = (departments != null) ? String.join(", ", departments) : "";
            String staffBehaviour = request.getParameter("StaffBehaviour");
            String cleanliness = request.getParameter("cleanliness");
            String overallRating = request.getParameter("overallRating");
            String comments = request.getParameter("feedback");

            FeedbackEntity f = new FeedbackEntity();
            f.setName(name);
            f.setAge(age);
            f.setVisitDate(visitDate);
            f.setCity(city);
            f.setDepartment(departmentStr);
            f.setStaffBehaviour(staffBehaviour);
            f.setCleanliness(cleanliness);
            f.setOverallRating(overallRating);
            f.setComments(comments);

            FeedbackDAOImp1 dao = new FeedbackDAOImp1();
            result = dao.insert(f);

            if (result > 0) {
                response.sendRedirect("thankYou.html");
            } else {
                out.println("<h2 style='color:red;text-align:center;'> Feedback submission failed. Please check the database connection.</h2>");
            }

        } catch (Exception e) {
            e.printStackTrace();
            out.println("<h2 style='color:red;text-align:center;'>⚠️ Error: " + e.getMessage() + "</h2>");
        }
    }
}
