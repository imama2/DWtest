public class soal3{
	public static void main (String[]args){
		String a = "GARUDA";
		drawline(a);
	}
	public static String drawline(String b){
		int j = b.length();
		
		for(int i = 0 ; i<j ; i++){
			for(int k = 0 ; k < i ; k++){
			System.out.print(" ");
			}
		System.out.print(b.substring(i,i+1));
		System.out.println();
		}
		return b;
	}
}