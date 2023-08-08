// Import statement:
import java.util.ArrayList;
class PrimeDirective {
  
  // Add your methods here:
  
// First, we need a way to determine whether a number is prime or isn’t prime.

// Create an empty public method isPrime() that:

// has one parameter: an int called number
// will return true if number is prime
// will return false if number is not prime
  public boolean isPrime(int number){
    if (number <= 1){
      return false;
    }
    for (int i = 2; i < number; i++){
      if (number % i == 0){
        return false;
      } 
    }return true;
  }
  
// Nice work! Now, all that’s left is building an ArrayList of the prime numbers in the numbers array.

// You can create another method to handle this. Build an empty method called onlyPrimes() that:

// returns an ArrayList of integers
// has a parameter numbers, which is an array of ints
  public ArrayList<Integer> onlyPrimes(int[] numbers){
    ArrayList<Integer> primes = new ArrayList<Integer>();
    for(int number: numbers){
      if (isPrime(number)){
        primes.add(number);
      }
    } return primes;
  }
  
  
  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
    System.out.print(pd.isPrime(7));
    System.out.print(pd.onlyPrimes(numbers));
  }  

}