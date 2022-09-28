package main;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.Time;


@WebServlet (name = "DateLocalTime", urlPatterns = {"/"})
public class DateLocalTime extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        Date currentDate = new Date();
        Time currentTime = new Time();
        writer.println(("<html>" +
                "<h1> Here is current local date and time: </h1>" +
                "<body>" + currentDate.toString() +
                "<body>" + currentTime.getTime() +
                "</body>" +
                "</html>"));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}