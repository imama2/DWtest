public class soal1{
	public static void main (String[]args){
		double b_awal = 6969;
		double mati = 0.111;
		double b_now = b_awal;
		for(int i = 1 ; i <= 21; i++){
		b_now = b_now*(1-mati);
		b_now = b_now*2;
		}
		int jumlah = (int)b_now;
		System.out.println(jumlah);
	}
}