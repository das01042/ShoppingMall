package com.yedam.common;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.yedam.emp.EmployeeVO;

/**
 * Servlet implementation class GetJsonServlet
 */
@WebServlet("/GetJsonServlet")
public class GetJsonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetJsonServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 //response.getWriter() :출력 스트림
		EmpDAO dao = new EmpDAO();
		List<Employee> list = dao.getEmployees();
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		
		
		
		
		System.out.println(gson.toJson(list).toString());
		response.getWriter().println(gson.toJson(list).toString());

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String empId = request.getParameter("empId");
		String firstName = request.getParameter("fName");// getParameter : 문자열로 출력
		String lastName = request.getParameter("lName"); // int타입은 parse로 변환해줘야됨.
		String email = request.getParameter("mail");
		String hireDate = request.getParameter("hDate");
		System.out.println(hireDate);
		String jobId = request.getParameter("job");
		String salary = request.getParameter("sal");

		System.out.println("empId : " + empId);
		System.out.println("fname : " + firstName);
		System.out.println("lname : " + lastName);

		EmpDAO dao = new EmpDAO();
		EmployeeVO vo = new EmployeeVO();
		String cmd = request.getParameter("cmd");
		vo.setEmployeeId(Integer.parseInt(empId));
		vo.setFirstName(firstName);
		vo.setLastName(lastName);
		vo.setEmail(email);
		vo.setJobId(jobId);
		vo.setHireDate(hireDate);
		
		if(!cmd.equals("delete"))
		vo.setSalary(Integer.parseInt(salary));
		

		if (cmd.equals("insert")) {
			if (dao.insertEmp(vo)) {
				// {"retCode":Success"}
				// 처리결과를 페이지에 출력해준다
				JSONObject innerObj = new JSONObject();
				innerObj.put("employeeId", vo.getEmployeeId());
				innerObj.put("firstName", vo.getFirstName());
				innerObj.put("lastName", vo.getLastName());
				innerObj.put("email", vo.getEmail());
				innerObj.put("hireDate", vo.getHireDate());
				innerObj.put("salary", vo.getSalary());
				
				JSONObject obj = new JSONObject ();
				obj.put("retCode", "Success");
				obj.put("retVal", innerObj);
				
				//{"retCode" : "Scuccess",
				//	"retVal " : {employee":301,"firstName":"Kildong","lastName":"Hong"...}
				//}
				response.getWriter().println(obj);

			} else {
				
				JSONObject err = new JSONObject();
				err.put("retCode", "Fail");
				err.put("retVal","처리중 에러발생");
				response.getWriter().println(err);
			}

		} else if (cmd.equals("update")) {
			//처리결과를 페이지에 출력
			if (dao.updateEmployee(vo) != null) {
				JSONObject innerObj = new JSONObject();
				innerObj.put("employeeId", vo.getEmployeeId());
				innerObj.put("firstName", vo.getFirstName());
				innerObj.put("lastName", vo.getLastName());
				innerObj.put("email", vo.getEmail());
				innerObj.put("hireDate", vo.getHireDate());
				innerObj.put("salary", vo.getSalary());
				
				JSONObject obj = new JSONObject ();
				obj.put("retCode", "Success");
				obj.put("retVal", innerObj);
				
				//{"retCode" : "Scuccess",
				//	"retVal " : {employee":301,"firstName":"Kildong","lastName":"Hong"...}
				//}
				response.getWriter().println(obj);
			} else {
				JSONObject err = new JSONObject();
				err.put("retCode", "Fail");
				err.put("retVal","처리중 에러발생");
				response.getWriter().println(err);

			}
		}else if (cmd.equals("delete")) {
			if (dao.deleteEmployee(empId)) {
				response.getWriter().println("{\"retCode\":\"Success\"}");
			} else {
				response.getWriter().println("{\"retCode\":\"Fail\"}");

			}
		}

	}//end of if()
}
