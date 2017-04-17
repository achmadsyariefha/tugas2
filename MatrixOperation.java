import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MatrixOperation {
	static int[][] Matrix1 = new int [2][2];
	static int[][] Matrix2 = new int [2][2];
	static int[][] MatrixSum = new int [2][2];
	
	public static void Menu (){
		System.out.println("Menu Utama");
		System.out.println("1. Penjumlahan");
		System.out.println("2. Pengurangan");
		System.out.println("3. Perkalian");
		System.out.println("4. Determinan");
		System.out.println("0. keluar");
	}
	public static int Matrixinput(){
		BufferedReader bufferedReader = new BufferedReader (new InputStreamReader(System.in));
		String InputNumber = null;
		try {
			InputNumber = bufferedReader.readLine();
		}
		catch (IOException error){
			System.out.println ("Masukan anda Bukan Angka");
		}
		int data = Integer.parseInt(InputNumber);
		return data;
		
	}
	public static void ReadMatrix() {
		System.out.println("Masukkan Data Matriks 1 :");
		for (int row = 0; row < 2; row++){
			for (int coloumn = 0; coloumn < 2; coloumn++){
				System.out.print("Matriks ["+(row+1)+"]["+(coloumn+1)+"] : ");
				Matrix1[row][coloumn] = Matrixinput();
			}
		}
		System.out.println("Masukkan Data Matriks 2 :");
		for (int row = 0; row < 2; row++){
			for (int coloumn = 0; coloumn < 2; coloumn++){
				System.out.print("Matriks ["+(row+1)+"]["+(coloumn+1)+"] : ");
				Matrix2[row][coloumn] = Matrixinput();
			}
		}
	}
	public static void MatrixSum(){
		for (int row = 0; row < 2; row++){
			for (int coloumn = 0; coloumn < 2; coloumn++){
				MatrixSum[row][coloumn] = Matrix1[row][coloumn] + Matrix2[row][coloumn];
			}
		}
	}
	public static void Matrixreduce(){
		for (int row = 0; row < 2; row++){
			for (int coloumn = 0; coloumn < 2; coloumn++){
				MatrixSum[row][coloumn] = Matrix1[row][coloumn] - Matrix2[row][coloumn];
			}
		}
	}
	public static void MatrixProduct(){
		for (int row = 0; row < 2; row++){
			for (int coloumn = 0; coloumn < 2; coloumn++){
				MatrixSum[0][0]=Matrix1[0][0]*Matrix2[0][0]+Matrix1[0][1]*Matrix2[1][0];
				MatrixSum[0][1]=Matrix1[0][0]*Matrix2[0][1]+Matrix1[0][1]*Matrix2[1][1];
				MatrixSum[1][0]=Matrix1[1][0]*Matrix2[0][0]+Matrix1[1][1]*Matrix2[1][0];
				MatrixSum[1][1]=Matrix1[1][0]*Matrix2[0][1]+Matrix1[1][1]*Matrix2[1][1];
			}
		}
	}
	public static void MatrixDeterminant(){
		System.out.println("Matriks 1");
		System.out.println();
		for (int row = 0; row < 2; row++){
			for (int coloumn = 0; coloumn < 2; coloumn++){
				System.out.print(Matrix1[row][coloumn] + " ");
			}
			System.out.println("");
		}
		int determinant1 = (Matrix1[0][0]*Matrix1[1][1])-(Matrix1[1][0]*Matrix1[0][1]);
		System.out.println("Determinan dari Matriks 1 adalah " + determinant1);
		if (determinant1 == 0) {
			System.out.println("Ini merupakan Matriks Pencerminan");
		}
		else {
			System.out.println("Matriks ini Bukanlah Matriks Pencerminan");
		}
		System.out.println();
		System.out.println("Matriks 2");
		System.out.println();
		for (int row = 0; row < 2; row++){
			for (int coloumn = 0; coloumn < 2; coloumn++){
				System.out.print(Matrix2[row][coloumn] + " ");
			}
			System.out.println("");
		}
		int determinant2 = (Matrix2[0][0]*Matrix2[1][1])-(Matrix2[1][0]*Matrix2[0][1]);
		System.out.println("Determinan dari Matriks 2 adalah " + determinant2);
		if (determinant2 == 0) {
			System.out.println("Ini merupakan Matriks Pencerminan");
		}
		else {
			System.out.println("Matriks ini Bukanlah Matriks Pencerminan");
		}
	}
	public static void Sumaddition(){
		System.out.println("Matriks Hasil : ");
		for (int row = 0; row < 2; row++){
			for (int coloumn = 0; coloumn < 2; coloumn++){
				System.out.print(MatrixSum[row][coloumn] + " ");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader (new InputStreamReader(System.in));
		String InputChoice = null;
		int choice = 0;
		do {
			System.out.println();
			Menu();
			System.out.println("Masukkan Pilihan Anda");
			try {
                InputChoice = bufferedReader.readLine();
                try  {
                    choice = Integer.parseInt(InputChoice);
                    if (choice > 0 && choice == 1) {
                        ReadMatrix();
						System.out.println();
						MatrixSum();
						System.out.println();
						Sumaddition();
                    }
                    else if (choice > 0 && choice == 2) {
						ReadMatrix();
						System.out.println();
						Matrixreduce();
						System.out.println();
						Sumaddition();
                    }
					else if (choice > 0 && choice == 3) {
						ReadMatrix();
						System.out.println();
						MatrixProduct();
						System.out.println();
						Sumaddition();
                    }
					else if (choice > 0 && choice == 4) {
						ReadMatrix();
						System.out.println();
						MatrixDeterminant();
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
		}
		while (choice > 0);
	}
	
	
}