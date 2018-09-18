package czu.yz.chapter1;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String currentTime = dateFormat.format(new Date());
//        req.setAttribute("currentTime",currentTime);
//        req.getRequestDispatcher("/hello.jsp").forward(req,resp);
//    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        RequestDispatcher rd=null;
        int  id = 1;
        req.setAttribute("currentTime", id);
        rd =req.getRequestDispatcher("WEB-INF/jsp/hello.jsp");


        //4.根据判断结果返回相应界面
        try {
            rd.forward(req, resp);

        } catch (ServletException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }
    }
}
