package in.co.rays.player;

public class TestPlayerModel {
	
	public static void main(String [] ags) throws Throwable{
	
		testAdd();
	}
	public static void testAdd() throws Exception {
		
		PlayerModel model = new PlayerModel();
        PlayerBean bean = new PlayerBean();
        
        bean.setPlayer_id(7);
        bean.setPlayer_name("CrisGayle");
        bean.setProffesion("Batsman");
        bean.setPlayer_age(50);
        
        model.add(bean);
	}

}
