import java.util.Scanner;

public class RecursiveIsPrime {
	
	static void isPrime(int number) {
        if (isPrimeRecursive(number, 2)) {
            System.out.println(number + " sayısı Asal sayıdır!");
        } else {
            System.out.println(number + " sayısı Asal değildir!");
        }
    }
	
	static boolean isPrimeRecursive(int n, int i) {
		if (n < 2) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        return isPrimeRecursive(n, i + 1);
	}

	public static void main(String[] args) {
		Scanner	scanner = new Scanner(System.in);
		
		System.out.print("Sayı Giriniz : ");
		int number = scanner.nextInt();
		
		isPrime(number);
	}

}
