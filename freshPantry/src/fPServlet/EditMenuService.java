package fPServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditMenuService
 */
@WebServlet("/fPServlet/EditMenuService")
public class EditMenuService extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditMenuService() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	response.setContentType("text/html;charset=UTF-8");
	String upDateMenuId = request.getParameter("update_menu_id");
	RequestDispatcher rd = null;
	String url = "";

	{

	// 変更メニューIDによって遷移画面を決定する。
	try {
		switch (upDateMenuId){

		case TO_FOOD_SELECT:
			// 食材変更・削除へ
			url = "/FoodSelect.jsp";
			break;

		case TO_RECIP_SELECT:
			// レシピ選択へ
			url = "/RecipSelect.jsp";
			break;

		case TO_NUTRIENT_SELECT:
			// 栄養素選択へ
			url = "/NutrientSelect.jsp";
			break;

		default:
			url = "/Main.jsp";
			break;
		}

		// 最後にフォワード
		rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
		return;

	}catch(Exception e) {
		e.printStackTrace();
	}
}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}