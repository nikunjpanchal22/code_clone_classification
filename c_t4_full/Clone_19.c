int main (int argc, char **argv) {
    gen_primes ();
    gen_table ();
    int cases = 0;
    scanf ("%d", & cases);
    for (int i = 0; i < cases; ++i) {
        long long a, b;
        scanf ("%lld %lld", & a, & b);
        printf ("%lld\n", count_lucky (b) - count_lucky (a - 1));
    }
    return 0;
}


  int main(int argc, char **argv) { 
    int * primes = find_primes(1000000); 
    int n = 1000000; 
    gen_table(primes, n); 
    int cases = 0; 
    scanf ("%d", &cases); 
    for (int i = 0; i < cases; ++i) { 
        long long a, b; 
        scanf ("%lld %lld", &a, &b); 
        char * lucky = (char*) malloc(b + 1); 
        memset(lucky, 0, b + 1); 
        int idx; 
        for (idx = 0; primes[idx] <= b; ++idx) { 
            long long x = (a + primes[idx] - 1) / primes[idx]; 
            while (x * primes[idx] <= b) { 
                lucky[x * primes[idx]] = 1; 
                ++x; 
            } 
        } 
        int count = 0; 
        for (idx = a; idx <= b; ++ idx) { 
            if (lucky[idx]) { 
                ++count; 
            } 
        } 
        printf ("%d\n", count); 
        free(lucky); 
    } 
    return 0; 
}


