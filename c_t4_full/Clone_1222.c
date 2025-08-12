int main () {
    const size_t X = 2;
    const size_t Y = 2;
    int (*a) [Y] = malloc (sizeof (int [X] [Y]));
    int count = 1;
    for (size_t x = 0; x < X; x++) {
        for (size_t y = 0; y < Y; y++) {
            a[x][y] = count++;
            printf ("%d ", a [x] [y]);
        }
        printf ("\n");
    }
    free (a);
}





#include <stdio.h>
#include <stdlib.h>

int main() {
	    int *arr = (int *) malloc(4 * sizeof(int));
	    for(int i = 0; i < 4; i++) {
		arr[i] = i + 1;
		printf("%d ", arr[i]);
		if((i + 1) % 2 == 0)
		    printf("\n");
	    }
	    free(arr);
}


