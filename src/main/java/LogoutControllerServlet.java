import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LogoutControllerServlet", urlPatterns = "/logout")
public class LogoutControllerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getParameter("islogout")!=null) {
            if (request.getParameter("islogout").equals("ok")) {
                request.removeAttribute("user");
                request.removeAttribute("username");
                request.removeAttribute("password");
                response.sendRedirect("login.jsp");
            }

        }
    }
}
