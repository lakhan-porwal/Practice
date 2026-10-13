package test;

public class TestEmployeeModel {
	
	public static void main(String []ags ) throws Throwable {
		
      testAdd();
		
	}
	
	public static void testAdd() throws Exception {
		
		EmployeeModel model = new EmployeeModel();
		EmployeeBean bean = new EmployeeBean();
		
		bean.setId(4);
		bean.setEmployee_name("Sachin");
		bean.setCompany_name("tata");
		bean.setSalary(100000);
		
		model.add(bean);
	}

}
