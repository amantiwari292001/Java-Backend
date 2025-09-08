import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import java.io.*;

public class FirstServlet extends GenericServlet {
    public void service(ServletRequest req, ServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>Hello Laadle</h1>");
    }
}