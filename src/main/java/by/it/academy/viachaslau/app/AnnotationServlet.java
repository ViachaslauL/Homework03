package by.it.academy.viachaslau.app;

import by.it.academy.viachaslau.app.counter.RequestCounter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AnnotationServlet", urlPatterns = "/annotation")
public class AnnotationServlet extends HttpServlet {
    private RequestCounter requestCounter = new RequestCounter();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        requestCounter.incrementCountAll();
        resp.getWriter().write("<html><b>AnnotationServlet</b>" +
                "<p>Count of requests: " + requestCounter.getCountAll() + "</p>" +
                "<p>Current thread: " + Thread.currentThread().getName() + "</p>" +
                "</html>");
    }
}
