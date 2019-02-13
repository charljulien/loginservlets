package Servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/getsession")
public class GetSession extends HttpServlet{
    private String requestText;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        requestText = request.getParameter("text");
        if (containWhitespace(requestText) || containNothing(requestText)){
            System.out.println("geen sessie gemaakt");
        } else{
            response.getWriter().println(requestText);
        }
    }

    public static boolean containWhitespace(String value) {
        return value.contains(" ");
    }
    public static boolean containNothing(String value){
        return value.contains(null);
    }

    public String getRequestText() {
        return requestText;
    }
}
