
public class iteration02practice {
	
	public static void main(String[] args) {
		int idx = 0;
		while(idx < 12){
			System.out.println("image" + (idx % 3 * 2 + 1) + ".png");
			//%3은 1,2,3 이니깐 3,2,1 순으로 바꾸고 싶으면 4로 빼면 된다. (4-(idx % 3 + 1)) 로 하면 된다.
			idx = idx + 1;
	}
	

}

}
