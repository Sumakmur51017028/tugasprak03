import java.util.Scanner;
class classPLN
{
	String nama,alamat;
	int tipe,harga,hargabayar,bayar,kembalian;
	char blok;
	Scanner i= new Scanner(System.in);
	
	void cetak()
	{
		System.out.print("nama: ");
		nama=i.nextLine();
		System.out.print("alamat: ");
		alamat=i.nextLine();
		System.out.print("tipe(36-37): ");
		tipe=i.nextInt();
		System.out.print("blok(A-B): ");
		blok=i.next().charAt(0);
		System.out.println();
		
		if(tipe==36 && blok=='A')
		{
			harga=500000;
		}
		else if(tipe==36 && blok=='B')
		{
			harga=300000;
		}
		else if(tipe==37 && blok=='A')
		{
			harga=800000;
		}
		else if(tipe==37 && blok=='B')
		{
			harga=600000;
		}
		else
		{
			harga=0;
		}
		
		
		
		System.out.println("Nama: "+nama);
		System.out.println("Alamat: "+alamat);
		System.out.println("Harga: Rp "+harga);
		System.out.print("Bayar: Rp ");
		bayar=i.nextInt();
		kembalian=bayar-harga;
		System.out.println("Kembalian: Rp "+kembalian);
		
	}
	
}