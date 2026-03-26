package beauty;
 
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;
 
public class ChiikawaAction extends Action{
	public String execute(
	        HttpServletRequest request, HttpServletResponse response
	    ) throws Exception {
 
		    HttpSession session = request.getSession();
		
	        String[] uru = request.getParameterValues("uru");
	        
	        session.setAttribute("uru", uru);
 
	        // ⑤ 表示する画面を返す
	        return "c-reserve.jsp";
	}
}