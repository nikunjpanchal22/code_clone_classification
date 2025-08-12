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
    char * primes = find_primes(1000000); 
    gen_table(primes, 1000000); 
    int cases = 0; 
    scanf ("%d", &cases); 
    for (int i = 0; i < cases; ++i) { 
        long long a, b; 
        scanf ("%lld %lld", &a, &b); 
        char * lucky = (char*) calloc(b + 1, sizeof(char)); 
        int idx; 
        for (idx = 2; idx < b+ 1; ++idx) { 
            if (primes[idx]) { 
                long long x = (a + idx - 1) / idx; 
                while (x * idx <= b) { 
                    lucky[x * idx] = 1; 
                    ++ x; 
                } 
            } 
        } 
        long long count = 0; 
        for (idx = a; idx <= b; ++ idx) { 
            if (lucky[idx]) { 
                ++count; 
            } 
        } 
        printf ("%lld\n", count); 
        free(lucky); 
    } 
    return 0; 
} 


