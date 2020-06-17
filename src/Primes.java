public class Primes {
    public static void main(String args[]) {
        for (int i = 2; i < 100; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
    }

    static boolean isPrime(int n) {
        // перебираем все числа от двух до n,
        // если хоть одно является делителем, то n не является простым числом
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
