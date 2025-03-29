class Solution {
    public int countPrimes(int n) {

        if(n <= 2) {
            return 0;
        }

        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);

        primes[0] = false;
        primes[1] = false;

        for(int i = 2; i * i <= n; i++) {
            if(primes[i]) {
                for(int j = i * i; j <= n; j+=i) {
                    primes[j] = false;
                }
            }
        }

        int ans = 0;

        for(int i = 1; i < n; i++) {
            if(primes[i]) {
                ans++;
            }
        }

        return ans;
    }
}