package corejava.array;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int t[] = { 1, 2, 3, 5 };
		
		int totalXor = 0;
		int arrayXor = 0;
		
		
		for (int i = 0; i < t.length; i++) {
			arrayXor = arrayXor ^ t[i];
			totalXor = totalXor ^ i;
		}
		
		totalXor = totalXor ^ t.length;
		totalXor = totalXor ^ 5;
		
		
		System.out.println(totalXor^arrayXor);
	}

}
