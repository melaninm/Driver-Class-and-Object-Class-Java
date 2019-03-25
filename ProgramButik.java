public class ProgramButik
{
	public static void main(String[]args)
	{
		Butik data = new Butik();
		data.setnamaButik("Welcome to Owl Boutique, Beauty Inside-Syar'i Outside");
		data.setnamaReseller("Melani, Nurul, Mudyawati");
		data.setphone("08132837565");
		data.setakunSosmed("instagram and twitter @owlboutique");
		data.setemail("OwlBoutique17@gmail.com");
		data.setalamat("Jalan A.H Nasution No 17");
		data.setjumlahGamisNaisha(27);
		data.setjumlahGamisZayra(30);
		data.setjumlahTunikAmira(23);
		data.setjumlahTunikNadya(25);
		data.setjumlahKhimarFatma(30);
		data.setjumlahKhimarKayla(38);
		data.setjumlahBergoIzzah(21);
		data.setjumlahBergoRahma(23);
		data.setjumlahCiputRajut(52);
		
		String namaButik = data.getnamaButik();
		String namaReseller = data.getnamaReseller();
		String phone = data.getphone();
		String akunSosmed = data.getakunSosmed();
		String email = data.getemail();
		String alamat = data.getalamat();
		int jumlahGamisNaisha = data.getjumlahGamisNaisha();
		int jumlahGamisZayra = data.getjumlahGamisZayra();
		int jumlahTunikAmira = data.getjumlahTunikAmira();
		int jumlahTunikNadya = data.getjumlahTunikNadya();
		int jumlahKhimarFatma = data.getjumlahKhimarFatma();
		int jumlahKhimarKayla = data.getjumlahKhimarKayla();
		int jumlahBergoIzzah = data.getjumlahBergoIzzah();
		int jumlahBergoRahma = data.getjumlahBergoRahma();
		int jumlahCiputRajut = data.getjumlahCiputRajut();
		
		System.out.println("=====================================");
		System.out.println(" "+namaButik);
		System.out.println("Agen Reseller Kami\t: "+namaReseller);
		System.out.println("No Telepon Kami\t\t: "+phone);
		System.out.println("Akun Sosmed Kami\t: "+akunSosmed);
		System.out.println("Email Official\t\t: "+email);
		System.out.println("Alamat Kantor\t\t: "+alamat);
		System.out.println("Stock Gamis Naisha\t: "+jumlahGamisNaisha+ " pieces");
		System.out.println("Stock Gamis Zayra\t: "+jumlahGamisZayra+ " pieces");
		System.out.println("Stock Tunik Amira\t: "+jumlahTunikAmira+ " pieces");
		System.out.println("Stock Tunik Nadya\t: "+jumlahTunikNadya+ " pieces");
		System.out.println("Stock Bergo Izzah\t: "+jumlahBergoIzzah+ " pieces");
		System.out.println("Stock Bergo Rahma\t: "+jumlahBergoRahma+ " pieces");
		System.out.println("Stock Ciput Rajut\t: "+jumlahCiputRajut+ " pieces");
		System.out.println("=====================================");
	}
}