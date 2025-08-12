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
    int primes[MAX_SIZE]; 
    int i, prime_count = gen_primes(primes); 
    gen_table(primes, prime_count); 
    int cases = 0; 
    scanf ("%d", &cases); 
    for (i = 0; i < cases; ++i) { 
        long long a, b; 
        scanf ("%lld %lld", &a, &b); 
        int prime_max = b + 1; 
        char * lucky = (char*) malloc(prime_max * sizeof(char)); 
        memset(lucky, 0, prime_max); 
        int idx; 
        for (idx = 0; idx < prime_count && primes[idx] <= b; ++idx) { 
            long long start_point = a / primes[idx]; 
            start_point *= primes[idx]; 
            for (long long x = start_point; x <= b; x += primes[idx]) { 
                lucky[x] = 1; 
            } 
            if (start_point < a) { 
                lucky[start_point + primes[idx]] = 1; 
            } 
        } 
        long long count = 0; 
        for (idx = a; idx <= b; ++idx) { 
            if (lucky[idx]) { 
                ++count; 
            } 
        } 
        printf ("%lld\n", count); 
        free(lucky); 
    } 
    return 0; 
}


