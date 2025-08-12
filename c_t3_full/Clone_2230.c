int main (void) {
    int number, p = 0, n = 0;
    while (1) {
        printf ("-> ");
        if (scanf ("%d", &number) == 0) {
            fflush (stdin);
            printf ("Err...\n");
            continue;
        }
        fflush (stdin);
        if (number > 0)
            p++;
        else if (number < 0)
            n++;
        else
            break;
    }
    printf ("Read %d positive and %d negative numbers\n", p, n);
    return 0;
}






#include <stdio.h>
int main() {
	  int num, positives = 0, negatives = 0;
	  while (true) {
	    printf("Input: ");
	    if (scanf("%d", &num) != 1) {
	      getchar();
	      printf("Invalid input... Try again\n");
	      continue;
	    }
	    getchar();
	    if (num > 0)
	      positives++;
	    else if (num < 0)
	      negatives++;
	    else
	      break;
	  }
	  printf("Counted %d positive and %d negative numbers\n", positives, negatives);
	  return 0;
}


