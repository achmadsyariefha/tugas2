import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class luasbangun {
	public static void TampilanMenu(){
		System.out.println ("Menu Utama");
		System.out.println ("[1] Balok");
		System.out.println ("[2] Tabung");
		System.out.println ("[3] Kubus");
		System.out.println ("[4] Bola");
		System.out.println ("[5] Persegi");
		System.out.println ("[6] Persegi Panjang");
		System.out.println ("[7] Segitiga");
		System.out.println ("[8] Belah Ketupat");
		System.out.println ("[9] Layang-Layang");
		System.out.println ("[10] Trapesium");
		System.out.println ("[11] Jajar Genjang");
		System.out.println ("[12] Lingkaran");
		System.out.println ("[0] Keluar");
	}
	public static void balok(){
		System.out.println("Masukkan Panjang Balok : ");
		BufferedReader bufferedreader = new BufferedReader (new InputStreamReader(System.in));
		String inputdataPanjang = null;
		try{
			inputdataPanjang = bufferedreader.readLine();
		} 
		catch (IOException error) {
			System.out.println("Inputan anda Error " + error.getMessage());
		}
		System.out.println("Masukkan Lebar Balok : ");
		bufferedreader = new BufferedReader (new InputStreamReader(System.in));
		String inputdataLebar = null;
		try{
			inputdataLebar = bufferedreader.readLine();
		} 
		catch (IOException error) {
			System.out.println("Inputan anda Error " + error.getMessage());
		}
		System.out.println("Masukkan Tinggi Balok : ");
		bufferedreader = new BufferedReader (new InputStreamReader(System.in));
		String inputdataTinggi = null;
		try{
			inputdataTinggi = bufferedreader.readLine();
		} 
		catch (IOException error) {
			System.out.println("Inputan anda Error " + error.getMessage());
		}
		try{
			int panjang = Integer.parseInt(inputdataPanjang);
			int lebar = Integer.parseInt(inputdataLebar);
			int tinggi = Integer.parseInt(inputdataTinggi);
			int luas = 2 * (panjang * lebar)+(panjang * tinggi)+(lebar * tinggi);
			int volume = panjang * lebar * tinggi;
			System.out.println("Luas Permukaannya ialah "+ luas);
			System.out.println("Volumenya ialah "+ volume);
		} 
		catch (NumberFormatException e) {
			System.out.println("Inputan anda Tidak Sesuai");
		}
	}
	public static void tabung() {
		System.out.println("Masukkan Jari Jari tabung : ");
		BufferedReader bufferedreader = new BufferedReader (new InputStreamReader(System.in));
		String inputdataJariJari = null;
		try{
			inputdataJariJari = bufferedreader.readLine();
		} 
		catch (IOException error) {
			System.out.println("Inputan anda Error " + error.getMessage());
		}
		System.out.println("Masukkan Tinggi tabung : ");
		bufferedreader = new BufferedReader (new InputStreamReader(System.in));
		String inputdataTinggi = null;
		try{
			inputdataTinggi = bufferedreader.readLine();
		} 
		catch (IOException error) {
			System.out.println("Inputan anda Error " + error.getMessage());
		}
		try{
			int jarijari = Integer.parseInt(inputdataJariJari);
			int tinggi = Integer.parseInt(inputdataTinggi);
			double luas = 2 * Math.PI * jarijari * (jarijari + tinggi);
			double volume = Math.PI * Math.pow(jarijari, 2) * tinggi;
			System.out.println("Luas Permukaannya ialah "+ luas);
			System.out.println("Volumenya ialah "+ volume);
		} 
		catch (NumberFormatException e) {
			System.out.println("Inputan anda Tidak Sesuai");
		}
	}
	public static void kubus() {
		System.out.println("Masukkan Panjang Kubus : ");
		BufferedReader bufferedreader = new BufferedReader (new InputStreamReader(System.in));
		String inputdataPanjang = null;
		try{
			inputdataPanjang = bufferedreader.readLine();
		} 
		catch (IOException error) {
			System.out.println("Inputan anda Error " + error.getMessage());
		}
		try{
			int panjang = Integer.parseInt(inputdataPanjang);
			int luas = 6 * (panjang * panjang);
			int volume = panjang * panjang * panjang;
			System.out.println("Luas Permukaannya ialah "+ luas);
			System.out.println("Volumenya ialah "+ volume);
		}
		catch (NumberFormatException e) {
			System.out.println("Inputan anda Tidak Sesuai");
		}
	}
	public static void bola(){
		System.out.println("Masukkan Jari Jari bola : ");
		BufferedReader bufferedreader = new BufferedReader (new InputStreamReader(System.in));
		String inputdataJariJari = null;
		try{
			inputdataJariJari = bufferedreader.readLine();
		} 
		catch (IOException error) {
			System.out.println("Inputan anda Error " + error.getMessage());
		}
		try{
			int jarijari = Integer.parseInt(inputdataJariJari);
			double luas = 4 * Math.pow(jarijari, 2);
			double volume = (4/3) * Math.PI * Math.pow(jarijari, 3);
			System.out.println("Luas Permukaannya ialah "+ luas);
			System.out.println("Volumenya ialah "+ volume);
		} 
		catch (NumberFormatException e) {
			System.out.println("Inputan anda Tidak Sesuai");
		}
	}
	public static void persegi() {
		System.out.println("Masukkan Panjang Sisi Persegi : ");
		BufferedReader bufferedreader = new BufferedReader (new InputStreamReader(System.in));
		String inputdataSisi = null;
		try{
			inputdataSisi = bufferedreader.readLine();
		} 
		catch (IOException error) {
			System.out.println("Inputan anda Error " + error.getMessage());
		}
		try{
			int sisi = Integer.parseInt(inputdataSisi);
			int keliling = 4 * sisi;
			int luas = sisi * sisi;
			System.out.println("Kelilingnya ialah "+ keliling);
			System.out.println("Luasnya ialah "+ luas);
		} 
		catch (NumberFormatException e) {
			System.out.println("Inputan anda Tidak Sesuai");
		}
	}
	public static void persegipanjang() {
		System.out.println("Masukkan Panjang persegi : ");
		BufferedReader bufferedreader = new BufferedReader (new InputStreamReader(System.in));
		String inputdataPanjang = null;
		try{
			inputdataPanjang = bufferedreader.readLine();
		} 
		catch (IOException error) {
			System.out.println("Inputan anda Error " + error.getMessage());
		}
		System.out.println("Masukkan Lebar persegi : ");
		bufferedreader = new BufferedReader (new InputStreamReader(System.in));
		String inputdataLebar = null;
		try{
			inputdataLebar = bufferedreader.readLine();
		} 
		catch (IOException error) {
			System.out.println("Inputan anda Error " + error.getMessage());
		}
		try{
			int panjang = Integer.parseInt(inputdataPanjang);
			int lebar = Integer.parseInt(inputdataLebar);
			int keliling = 2 * (panjang + lebar);
			int luas = panjang * lebar;
			System.out.println("Kelilingnya ialah "+ keliling);
			System.out.println("Luasnya ialah "+ luas);
		}
		catch (NumberFormatException e) {
				System.out.println("Inputan anda Tidak Sesuai");
		}
	}
	public static void segitiga(){
		System.out.println("Masukkan Alas Segitiga : ");
		BufferedReader bufferedreader = new BufferedReader (new InputStreamReader(System.in));
		String inputdataAlas = null;
		try{
			inputdataAlas = bufferedreader.readLine();
		} 
		catch (IOException error) {
			System.out.println("Inputan anda Error " + error.getMessage());
		}
		System.out.println("Masukkan Tinggi Segitiga : ");
		bufferedreader = new BufferedReader (new InputStreamReader(System.in));
		String inputdataTinggi = null;
		try{
			inputdataTinggi = bufferedreader.readLine();
		} 
		catch (IOException error) {
			System.out.println("Inputan anda Error " + error.getMessage());
		}
		try{
			int alas = Integer.parseInt(inputdataAlas);
			int tinggi = Integer.parseInt(inputdataTinggi);
			int keliling = 3 * alas;
			double luas = 0.5 * alas * tinggi;
			System.out.println("Kelilingnya ialah "+ keliling);
			System.out.println("Luasnya ialah "+ luas);
		}
		catch (NumberFormatException e) {
				System.out.println("Inputan anda Tidak Sesuai");
		}
	}
	public static void belahketupat(){
		System.out.println("Masukkan Panjang Sisi Belah Ketupat : ");
		BufferedReader bufferedreader = new BufferedReader (new InputStreamReader(System.in));
		String inputdataSisi = null;
		try{
			inputdataSisi = bufferedreader.readLine();
		}
		catch (IOException error) {
			System.out.println("Inputan anda Error " + error.getMessage());
		}
		System.out.println("Masukkan Diagonal Ketupat : ");
		bufferedreader = new BufferedReader (new InputStreamReader(System.in));
		String inputdataDiagonal = null;
		try{
			inputdataDiagonal = bufferedreader.readLine();
		} 		
		catch (IOException error) {
			System.out.println("Inputan anda Error " + error.getMessage());
		}
		try{
			int sisi = Integer.parseInt(inputdataSisi);
			int diagonal = Integer.parseInt(inputdataDiagonal);
			int keliling = 4 * sisi;
			double luas = 0.5 * (diagonal * diagonal);
			System.out.println("Kelilingnya ialah "+ keliling);
			System.out.println("Luasnya ialah "+ luas);
		} 
		catch (NumberFormatException e) {
			System.out.println("Inputan anda Tidak Sesuai");
		}
	}
	public static void layanglayang(){
		System.out.println("Masukkan Panjang Layang-Layang : ");
		BufferedReader bufferedreader = new BufferedReader (new InputStreamReader(System.in));
		String inputdataPanjang = null;
		try{
			inputdataPanjang = bufferedreader.readLine();
		} 
		catch (IOException error) {
			System.out.println("Inputan anda Error " + error.getMessage());
		}
		System.out.println("Masukkan lebar Layang-Layang : ");
		bufferedreader = new BufferedReader (new InputStreamReader(System.in));
		String inputdataLebar = null;
		try{
			inputdataLebar = bufferedreader.readLine();
		} 
		catch (IOException error) {
			System.out.println("Inputan anda Error " + error.getMessage());
		}
		System.out.println("Masukkan Diagonal Pertama Layang-Layang : ");
		bufferedreader = new BufferedReader (new InputStreamReader(System.in));
		String inputdataDiagonalPertama = null;
		try{
			inputdataDiagonalPertama = bufferedreader.readLine();
		} 
		catch (IOException error) {
			System.out.println("Inputan anda Error " + error.getMessage());
		}
		System.out.println("Masukkan Diagonal Kedua Layang-Layang : ");
		bufferedreader = new BufferedReader (new InputStreamReader(System.in));
		String inputdataDiagonalKedua = null;
		try{
			inputdataDiagonalKedua = bufferedreader.readLine();
		} 
		catch (IOException error) {
			System.out.println("Inputan anda Error " + error.getMessage());
		}
		try{
			int panjang = Integer.parseInt(inputdataPanjang);
			int lebar = Integer.parseInt(inputdataLebar);
			int diagonalpertama = Integer.parseInt(inputdataDiagonalPertama);
			int diagonalkedua = Integer.parseInt(inputdataDiagonalKedua);
			int keliling = 2 * (panjang + lebar);
			double luas = 0.5 * (diagonalpertama * diagonalkedua);
			System.out.println("Kelilingnya ialah "+ keliling);
			System.out.println("Luasnya ialah "+ luas);
		}
		catch (NumberFormatException e) {
				System.out.println("Inputan anda Tidak Sesuai");
		}
	}
	public static void trapesium(){
		System.out.println("Masukkan Sisi Atas Trapesium : ");
		BufferedReader bufferedreader = new BufferedReader (new InputStreamReader(System.in));
		String inputdataSisiAtas = null;
		try{
			inputdataSisiAtas = bufferedreader.readLine();
		} 
		catch (IOException error) {
			System.out.println("Inputan anda Error " + error.getMessage());
		}
		System.out.println("Masukkan Sisi Bawah Trapesium : ");
		bufferedreader = new BufferedReader (new InputStreamReader(System.in));
		String inputdataSisiBawah = null;
		try{
			inputdataSisiBawah = bufferedreader.readLine();
		} 
		catch (IOException error) {
			System.out.println("Inputan anda Error " + error.getMessage());
		}
		System.out.println("Masukkan Sisi Miring Trapesium : ");
		bufferedreader = new BufferedReader (new InputStreamReader(System.in));
		String inputdataSisiMiring = null;
		try{
			inputdataSisiMiring = bufferedreader.readLine();
		} 
		catch (IOException error) {
			System.out.println("Inputan anda Error " + error.getMessage());
		}
		System.out.println("Masukkan Tinggi Trapesium : ");
		bufferedreader = new BufferedReader (new InputStreamReader(System.in));
		String inputdataTinggi = null;
		try{
			inputdataTinggi = bufferedreader.readLine();
		} 
		catch (IOException error) {
			System.out.println("Inputan anda Error " + error.getMessage());
		}
		try{
			int sisiatas = Integer.parseInt(inputdataSisiAtas);
			int sisibawah = Integer.parseInt(inputdataSisiBawah);
			int sisimiring = Integer.parseInt(inputdataSisiMiring);
			int tinggi = Integer.parseInt(inputdataTinggi);
			int keliling = sisiatas + sisibawah + (2 * sisimiring);
			double luas = 0.5 * (sisiatas + sisibawah) * tinggi;
			System.out.println("Kelilingnya ialah "+ keliling);
			System.out.println("Luasnya ialah "+ luas);
		}
		catch (NumberFormatException e) {
				System.out.println("Inputan anda Tidak Sesuai");
		}
	}
	public static void jajargenjang(){
		System.out.println("Masukkan Sisi Bawah Jajar Genjang : ");
		BufferedReader bufferedreader = new BufferedReader (new InputStreamReader(System.in));
		String inputdataSisiBawah = null;
		try{
			inputdataSisiBawah = bufferedreader.readLine();
		} 
		catch (IOException error) {
			System.out.println("Inputan anda Error " + error.getMessage());
		}
		System.out.println("Masukkan Sisi Miring Jajar Genjang : ");
		bufferedreader = new BufferedReader (new InputStreamReader(System.in));
		String inputdataSisiMiring = null;
		try{
			inputdataSisiMiring = bufferedreader.readLine();
		} 
		catch (IOException error) {
			System.out.println("Inputan anda Error " + error.getMessage());
		}
		System.out.println("Masukkan Tinggi Trapesium : ");
		bufferedreader = new BufferedReader (new InputStreamReader(System.in));
		String inputdataTinggi = null;
		try{
			inputdataTinggi = bufferedreader.readLine();
		} 
		catch (IOException error) {
			System.out.println("Inputan anda Error " + error.getMessage());
		}
		try{
			int sisibawah = Integer.parseInt(inputdataSisiBawah);
			int sisimiring = Integer.parseInt(inputdataSisiMiring);
			int tinggi = Integer.parseInt(inputdataTinggi);
			int keliling = (2 * sisibawah) + (2 * sisimiring);
			int luas = sisibawah * tinggi;
			System.out.println("Kelilingnya ialah "+ keliling);
			System.out.println("Luasnya ialah "+ luas);
		}
		catch (NumberFormatException e) {
				System.out.println("Inputan anda Tidak Sesuai");
		}
	}
	public static void lingkaran(){
		System.out.println("Masukkan Jari Jari lingkaran : ");
		BufferedReader bufferedreader = new BufferedReader (new InputStreamReader(System.in));
		String inputdataJariJari = null;
		try{
			inputdataJariJari = bufferedreader.readLine();
		} 
		catch (IOException error) {
			System.out.println("Inputan anda Error " + error.getMessage());
		}
		try{
			int jarijari = Integer.parseInt(inputdataJariJari);
			double keliling = 2 * Math.PI * jarijari;
			double luas = Math.PI * Math.pow(jarijari, 2);
			System.out.println("Kelilingnya ialah "+ keliling);
			System.out.println("Luasnya ialah "+ luas);
		} 
		catch (NumberFormatException e) {
			System.out.println("Inputan anda Tidak Sesuai");
		}
	}
	public static void main(String[] args){
		BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));
		String inputdata = null;
		int pilihan = 0;
		do{
			TampilanMenu();
			System.out.println("Masukkan Pilihan Anda : ");
			try {
                inputdata = bufferedreader.readLine();
                try  {
                    pilihan = Integer.parseInt(inputdata);
                    if (pilihan > 0 && pilihan == 1) {
                        balok();
                    }
                    else if (pilihan > 0 && pilihan == 2) {
                        tabung();
                    }
					else if (pilihan > 0 && pilihan == 3) {
                        kubus();
                    }
					else if (pilihan > 0 && pilihan == 4) {
                        bola();
                    }
					else if (pilihan > 0 && pilihan == 5) {
                        persegi();
                    }
					else if (pilihan > 0 && pilihan == 6) {
                        persegipanjang();
                    }
					else if (pilihan > 0 && pilihan == 7) {
                        segitiga();
                    }
					else if (pilihan > 0 && pilihan == 8) {
                        belahketupat();
                    }
					else if (pilihan > 0 && pilihan == 9) {
                        layanglayang();
                    }
					else if (pilihan > 0 && pilihan == 10) {
                        trapesium();
                    }
					else if (pilihan > 0 && pilihan == 11) {
                        jajargenjang();
                    }
					else if (pilihan > 0 && pilihan == 12) {
                        lingkaran();
                    }
                    else {
                        System.out.println("Terimakasih telah menggunakan aplikasi ini!");
                    }
                }
                catch(NumberFormatException e) {
                    System.out.println("Masukan Anda Tidak Sesuai");
                }
            }
            catch (IOException error) {
                System.out.println("Inputan anda Error " + error.getMessage());
            }

        } while(pilihan > 0);
		
	}
}