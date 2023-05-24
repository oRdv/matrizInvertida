package br.senai.sp.jandira;

public class Inverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int matrizA[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}; 
		int matrizB[] = new int [20];
		int i;
		
		i = 1;
		
		while (i < matrizB.length + 1) {
			matrizB[i - 1] = matrizA[20 - i];
			System.out.println (matrizB[i-1]);
			i++;
		}
		
	}

}
