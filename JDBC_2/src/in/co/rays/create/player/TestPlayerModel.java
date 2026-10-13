package in.co.rays.create.player;

import java.sql.Connection;

import in.co.rays.util.JDBCDataSource;

public class TestPlayerModel {
	
	public static void main(String [] ags) throws Throwable{
		
	//	testAdd();
	//	testUpdate();
	//	testDelete();
		testFindByPk();
	}
	
	public static void testAdd() throws Exception{
		
		PlayerModel model = new PlayerModel();
		PlayerBean bean = new PlayerBean();
			
		bean.setPlayer_id(6);
		bean.setPlayer_name("Rituraj Gaikward");
		bean.setProffesion("Batsman");
		bean.setPlayer_age(30);
		
		model.add(bean);
		
	}
	public static void testUpdate() throws Throwable{
	
	
		Connection conn = null;
		
		try {
			
			PlayerModel model = new PlayerModel();
			PlayerBean bean = new PlayerBean();
			
			bean.setPlayer_id(4);
			bean.setPlayer_name("Ravindra");
		    bean.setProffesion("AllRounder");
			bean.setPlayer_age(37);
			
			
			model.update(bean);
			
		} catch (Exception e) {
			e.printStackTrace();
			conn.rollback();
			
			// TODO: handle exception
			
		}
		
	}
	
	public static void testDelete() throws Throwable{
		
		Connection conn = null;
		
		try {
			PlayerModel model = new PlayerModel();
			
			model.delete(2);
		}catch (Exception e) {
			e.printStackTrace();
			conn.rollback();
			
		
		}
	}
	public static void testFindByPk() throws Throwable{
		
		PlayerBean bean = new PlayerBean();
		PlayerModel model = new PlayerModel();
		
		bean = model.findByPk(5);
		
		 if(bean != null) {
			 
			 System.out.println("Player_id => " + bean.getPlayer_id());
			 System.out.println("Player_name => " + bean.getPlayer_name());
			 System.out.println("ProfFession => " + bean.getProffesion());
			 System.out.println("Player_age => " + bean.getPlayer_age());
		 }else {
			 System.out.println("Record not found");
		 }
		
	}

}
