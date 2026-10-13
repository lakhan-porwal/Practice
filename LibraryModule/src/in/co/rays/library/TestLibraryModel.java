package in.co.rays.library;

public class TestLibraryModel {

	public static void main(String[] ags) throws Throwable {

//		testAdd();
//		testUpdate();
		testDelete();
	}

	public static void testAdd() throws Exception {

		LibraryModel model = new LibraryModel();
		LibraryBean bean = new LibraryBean();

		bean.setLibraryId(6);
		bean.setLibraryName("Amit Sharma");
		bean.setAddress("Indore");
		bean.setTotalBooks(50);
		bean.setContactNo("260554001");

		model.add(bean);
	}

	public static void testUpdate() throws Exception {

		LibraryModel model = new LibraryModel();
		LibraryBean bean = new LibraryBean();

		bean.setLibraryId(1);
		bean.setLibraryName("Rau Central Library");
		bean.setAddress("Rau Main Road, Near Square");
		bean.setTotalBooks(1200);
		bean.setContactNo("0731-2605540");

		model.update(bean);

	}

	public static void testDelete() throws Exception {

		LibraryModel model = new LibraryModel();

		model.delete(6);
	}

}
