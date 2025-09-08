import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class HTTPSServer extends HttpServlet {
    List<User> users = new ArrayList<>();
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h2>Register User</h2>");

        if(users.isEmpty()){
            out.println("<p>No user registered</p>");
        }else {
            out.println("<ul>");
            for(User user: users){
                out.println("<li>" + user.getName() + " - " + user.getAge() + "</li>");
            }
            out.println("</ul>");
        }
        out.println("<a href = 'index.html'>Back to home</a>");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String name = req.getParameter("name");
        String age = req.getParameter("age");
        users.add(new User(age, name));
        out.println("<h3>Successfully Registered</h3><br>");
        out.println("<a href='user'>See your users</a>");
    }
}

class User{
    private String age;
    private String name;

    public User(String age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}