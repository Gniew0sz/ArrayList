
public class Main {
    void main(String[] args) {
        System.out.println("13 is prime: "+isPrime(13));
        System.out.println("15 is prime: "+isPrime(15));
        System.out.println("19 is prime: "+isPrime(19));
        System.out.println("23 is prime: "+isPrime(23));
        System.out.println("24 is prime: "+isPrime(24));
    }
    boolean isPrime(int number) {
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}