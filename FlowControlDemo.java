
public class FlowControlDemo {
	public static void main(String[] args) {	
	int count = 50;
	int increment = 1;
	try {
		while(count > 0) {
			if(count % 2 == 0){
				count--;
				for(int x = 0; x < increment; x++) {
					System.out.print("*");
				}
				increment++;
			}
			else {
				System.out.println("$");
				count--;
			}
		}
	}catch (Exception e) {
		e.printStackTrace();
		
		}
	}
}
