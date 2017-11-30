import java.util.ArrayList;
import java.util.List;

public class HeapOOM {
	static class OOMObject{
		
	}
	public static void main(String[] args){
		List<OOMObject> list = new ArrayList<>();
		int i = 0;
		while(true){
			//list.add(new OOMObject());
			System.out.println(i++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
