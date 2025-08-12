int main () {
    int n, count;
    printf ("Insert a number:\n");
    scanf ("%d", & n);
    count = 0;
    n++;
    for (; count < 10; n++) {
        if (isPrime (n)) {
            printf ("%d\n", n);
            count++;
        }
    }
    return 0;
}






#include <math.h>

int isPrime(int n) {
      if (n <= 1) return 0;
      if (n == 2) return 1;
      if (n % 2 == 0) return 0;
      for (int i = 3; i <= sqrt(n); i += 2) {
        if (n % i == 0) return 0;
      }
      return 1;
    }

    int main() {
      int n, count = 0;
      printf("Insert a number:\n");
      scanf("%d", &n);
      n++;
      while(count < 10) {
        if (isPrime(n)) {
          printf("%d\n", n);
          count++;
        }
        n += 2;
      }
      return 0;
}


