package in.co.rays.test;

import in.co.rays.bean.HospitalBean;
import in.co.rays.model.HospitalModel;

public class HospitalModelTest {

	public static void main(String[] args) {

		testAdd();
	}

	public static void testAdd() {

		HospitalBean bean = new HospitalBean();
		HospitalModel model = new HospitalModel();

		bean.setPatientId(1);
		bean.setName("Vinod");
		bean.setAge(40);
		bean.setBloodGroup("B+");
		bean.setDisease("Malaria");

		model.add(bean);

	}
}