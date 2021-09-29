package by.it.academy.viachaslau.app;

import by.it.academy.viachaslau.app.counter.RequestCounter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class WebXmlServlet extends HttpServlet {
    private RequestCounter requestCounter = new RequestCounter();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if (req.getMethod().equals("GET")) {
            requestCounter.incrementCountGet();
        } else if (req.getMethod().equals("POST")) {
            requestCounter.incrementCountPost();
        }

        resp.getWriter().write("<html><b>WebXmlServlet</b>" +
                        "<p>Count of GET requests: " + requestCounter.getCountGet() + "</p>" +
                        "<p>Count of POST requests: " + requestCounter.getCountPost() + "</p>" +
                        "<p>Current thread: " + Thread.currentThread().getName() + "</p>" +
                        "</html>");
    }
}
