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





#include <cstdio>
extern void gen_primes();
extern void gen_table();
extern long long count_lucky(long long n);

int main() {
	  gen_primes();
	  gen_table();
	  int test_cases;
	  scanf("%d", &test_cases);
	  while (test_cases--) {
	    long long int a, b;
	    scanf("%lld %lld", &a, &b);
	    printf("%lld\n", count_lucky(b) - count_lucky(a - 1));
	  }
	  return 0;
}


