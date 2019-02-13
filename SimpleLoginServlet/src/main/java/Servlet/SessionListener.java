package Servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener, ServletContextListener{
    GetSession session = new GetSession();
    String userName = "";
    public static final String LOGIN = "login";
    public static final String LOGOUT = "Logout";

    public void sessionCreated(HttpSessionEvent se) {
        ServletContext sc = se.getSession().getServletContext();
        userName = session.getRequestText();

        sc.getAttribute(LOGIN);
        sc.setAttribute(LOGIN, userName);

        sc.getAttribute(LOGOUT);
        sc.setAttribute(LOGOUT, userName);

    }

    public void sessionDestroyed(HttpSessionEvent se) {
        ServletContext sc = se.getSession().getServletContext();
        userName = session.getRequestText();
        sc.setAttribute(LOGOUT, userName);
    }

    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Context initialized");
        sce.getServletContext().setAttribute(LOGIN, "");
        sce.getServletContext().setAttribute(LOGOUT, "");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Context destroyed");
    }
}
