import converters.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

@WebServlet(name = "ConvertServlet", urlPatterns = {"/convertServlet"})
public class ConvertServlet extends HttpServlet {
    ConvertStrategy convert = null;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String input = request.getParameter("input");
        String from = request.getParameter("from");
        String to = request.getParameter("to");
        String output = "";

        switch (from) {
            case "binary_in":
                convert = new ConvertTwoToTen();
                break;
            case "ternary_in":
                convert = new ConvertThreeToTen();
                break;
            case "octal_in":
                convert = new ConvertEightToTen();
                break;
            case "decimal_in":
                convert = new ConvertTenToTen();
                break;
            case "hexadecimal_in":
                convert = new ConvertSixteenToTen();
                break;
        }
        output = convert.Convert(input);
        switch (to) {
            case "binary_out":
                convert = new ConvertTenToTwo();
                break;
            case "ternary_out":
                convert = new ConvertTenToThree();
                break;
            case "octal_out":
                convert = new ConvertTenToEight();
                break;
            case "decimal_out":
                convert = new ConvertTenToTen();
                break;
            case "hexadecimal_out":
                convert = new ConvertTenToSixteen();
                break;
        }
        output = convert.Convert(output);
        request.setAttribute("output", output);
        request.setAttribute("input", input);
        request.setAttribute("from", from);
        request.setAttribute("to", to);

        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
