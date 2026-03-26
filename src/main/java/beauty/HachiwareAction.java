package beauty;
 
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;
 
public class HachiwareAction extends Action{
	public String execute(
	        HttpServletRequest request, HttpServletResponse response
	    ) throws Exception {
 
		    HttpSession session = request.getSession();
		
	        String[] mlife = request.getParameterValues("mlife");
	        
	        session.setAttribute("mlife", mlife);
 
	        // ⑤ 表示する画面を返す
	        return ".jsp";
	}
}