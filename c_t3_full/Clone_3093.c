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
        if (n == 1 || n == 0) {
          return 0;
        }

        int limit = sqrt(n);

        for (int i = 2; i <= limit; i++) {
          if (n % i == 0) {
            return 0;
          }
        }

        return 1;
      }

      int main() {
        int n, count = 0;
        printf("Insert a number:\n");
        scanf("%d", &n);
        for (count=0; count<10; n++) {
          if (isPrime(n)) {
            printf("%d\n", n);
            count++;
          }
        }

        return 0;
}


