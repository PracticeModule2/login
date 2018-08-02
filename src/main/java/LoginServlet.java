import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.net.HttpCookie;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String user = request.getParameter("user");
        String pass = request.getParameter("password");
        HttpSession session = request.getSession();
        if (user.equals("admin") && pass.equals("admin")) {
            Cookie username = new Cookie("username", "admin");
            Cookie password = new Cookie("password", "admin");
            if (request.getParameter("chkRemember") != null) {
                username.setMaxAge(60 * 60 * 24);
                password.setMaxAge(60 * 60 * 24);
            } else {
                username.setMaxAge(0);
                password.setMaxAge(0);
            }
            response.addCookie(username);
            response.addCookie(password);

            session.setAttribute("user", "admin");
            RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
            dispatcher.forward(request, response);
        }else {
            request.setAttribute("error", "Username and Password invalid !");
            RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
            dispatcher.forward(request, response);
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
