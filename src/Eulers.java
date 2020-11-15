public class Eulers {

        static boolean isprime(long n) {
            // check whether a number is prime or not
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return false;
        }

        static boolean isperfect(long n) // perfect numbers
        {
            // check is n is perfect sum of divisors
            // except the number itself = number
            long s = -n;
            for (long i = 1; i * i <= n; i++) {

                // is i is a divisor of n
                if (n % i == 0) {
                    long factor1 = i, factor2 = n / i;
                    s += factor1 + factor2;

                    // here i*i == n
                    if (factor1 == factor2) {
                        s -= i;
                    }
                }
            }
            return (n == s);
        }

        // Driver Code
        public static void main(String[] args) {
            // storing powers of 2 to access in O(1) time
            long power2[] = new long[61];
            for (int i = 0; i <= 60; i++) {
                power2[i] = 1L << i;
            }

            // generation of first few numbers
            // satisfying Euclid Euler's theorem
            System.out.print("Generating first few numbers " +
                    "satisfying Euclid Euler's theorem\n");
            for (int i = 2; i <= 25; i++) {
                long no = (power2[i] - 1) * (power2[i - 1]);
                if (isperfect(no) && (no % 2 == 0)) {
                    System.out.print("(2^" + i + " - 1) * (2^(" +
                            i + " - 1)) = " + no + "\n");
                }
            }
        }

    }
