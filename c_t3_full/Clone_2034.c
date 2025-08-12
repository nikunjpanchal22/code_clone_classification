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





#include <stdio.h>
void gen_primes();
void gen_table();
long long count_lucky(long long n);

int main () {
	  gen_primes();
	  gen_table();
	  int runs;
	  scanf ("%d", &runs);
	  for (int i = 0; i < runs; i++) {
	    long long range_begin, range_end;
	    scanf ("%lld %lld", &range_begin, &range_end);
	    printf ("%lld\n", count_lucky(range_end) - count_lucky(range_begin - 1));
	  }
	  return 0;
}


