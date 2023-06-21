package while_;

public class TestClass10 {

	public static void main(String[] args) {
		
		String n1=null, n2="test";
		System.out.println(n2.equals(n1));
		//System.out.println(n1.equals(n2));
		if(n1==null) {
			System.out.println("n1값을 먼저 입력하세요.");
		}else {
			System.out.println(n1.equals(n2));
		}

	}

}
