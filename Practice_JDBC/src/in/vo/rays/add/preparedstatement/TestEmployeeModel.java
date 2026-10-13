package in.vo.rays.add.preparedstatement;

public class TestEmployeeModel {

	public static void main(String[] ags) throws Exception {

		testAdd();

	}

	private static void testAdd() throws Exception {
		

		EmployeeModel model = new EmployeeModel();
		EmployeeBean bean = new EmployeeBean();

		bean.setId(3);
		bean.setEmployee_name("Atul");
		bean.setCompany("TCS");
		bean.setSalary(90000);

		model.add(bean);
	}
}