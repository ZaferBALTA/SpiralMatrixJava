package githubOrnekleriBilgisayarKavramlari;

import java.util.Scanner;

public class salyangozMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int matris[][] = new int[a][a];
		int sayac = 1;
		
		for(int i = 0; i<((a/2)+0.5); i++) {
			for(int j = 0; j<a-i-i; j++) { //7-0-0=7, 7-1-1=5, 7-2-2=3, 7-3-3=1
				matris[i][j+i] = sayac;
				sayac++;
			}
			for(int k=0; k<a-i-1-i; k++) {
				matris[k+1+i][a-i-1] = sayac;
				sayac++;
			}
			for(int l=0; l<a-i-1-i;l++) {
				matris[a-i-1][a-i-2-l] = sayac;
				sayac++;
			}
			for(int m = 0; m<a-i-2-i; m++) {
				matris[a-i-2-m][i] = sayac;
				sayac++;
			}
			
		}
		System.out.println("sayac: "+sayac);
		for(int i = 0; i<a; i++) {
			for(int j = 0; j<a; j++) {
				System.out.print(matris[i][j]+ " ");
			}
			System.out.println();
		}
		
		
	}

}
