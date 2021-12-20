import java.util.Scanner;

class Main2752 {
    public static void main(String[] args) {
	int[] num = new int[3];
	Scanner sc = new Scanner(System.in);

	for (int i = 0; i < num.length; i++) {
	    num[i] = sc.nextInt();
	}
	for (int i = 1; i < num.length; i++) {
	    for (int j = 0; j < num.length - i; j++) {
		if (num[j] > num[j + 1]) {
		    num[j] = num[j] ^ num[j + 1];
		    num[j + 1] = num[j + 1] ^ num[j];
		    num[j] = num[j] ^ num[j + 1];
		}
	    }
	}
	for (int i = 0; i < num.length; i++) {
	    System.out.println(num[i]);
	}
    }
}