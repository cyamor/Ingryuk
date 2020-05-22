package mvc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.RequestDispatcher;

import data.UserDTO;
import data.UserSQL;

@WebServlet("/Join.do")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public JoinServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");

		RequestDispatcher dis = request.getRequestDispatcher("Join.jsp");
		dis.forward(request, response);

	}// doGet END

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		HttpSession session=request.getSession();
		UserDTO dto = new UserDTO();
		UserSQL sql = new UserSQL();
		dto.setUid(request.getParameter("userid"));
		dto.setUpwd(request.getParameter("PWD"));
		dto.setUname(request.getParameter("name"));
		dto.setUbirth(request.getParameter("birth"));
		dto.setUphone(request.getParameter("phone"));
		dto.setUemail(request.getParameter("email"));
		dto.setUtype(null);

		int ok = sql.userInsert(dto);
		if (ok > 0) {
			System.out.println("회원가입 성공");
			session.setAttribute("userid",dto.getUid());
			request.setAttribute("messgae","회원 가입에 성공했습니다.");
			RequestDispatcher dis = request.getRequestDispatcher("Login.jsp");
			dis.forward(request, response);
					
		}else {
			System.out.println("회원가입 실패");
			request.setAttribute("messgae","회원 가입에 실패했습니다.");
			response.sendRedirect("Home.jsp");
		}

	}

	public void doUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}