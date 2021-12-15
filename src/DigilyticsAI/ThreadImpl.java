package DigilyticsAI;

public class ThreadImpl extends Thread{
	
	

	public static void main(String[] args) {
		
		for(int i=0;i<3;i++) {
			ThreadImpl th=new ThreadImpl();
			th.start();
		}

	}

}
