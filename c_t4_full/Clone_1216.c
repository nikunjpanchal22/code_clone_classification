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
	  const int row = 2;
	  const int col = 2;
	  int **arr =(int **) malloc(row * sizeof(int *));
	  for(int i = 0; i < row; i++) {
	    arr[i] = (int *) malloc(col * sizeof(int));
	  }
	  int counter = 1;
	  for(int i = 0; i < row; i++) {
	    for(int j = 0; j < col; j++) {
	      arr[i][j] = counter++;
	      printf("%d ", arr[i][j]);
	    }
	    printf("\n");
	  }
	  for(int i = 0; i < row; i++) {
	    free(arr[i]);
	  }
	  free(arr);
}


