int main () {
    int v1 [3], v2 [3], v3 [3], i;
    for (i = 0; i < 3; i++) {
        printf ("Type a number : \n");
        scanf ("%d", & v1 [i]);
    }
    for (i = 0; i < 3; i++) {
        printf ("Type a number : \n");
        scanf ("%d", & v2 [i]);
    }
    for (i = 0; i < 3; i++) {
        v3[i] = v1[i] + v2[i];
        printf ("Total : %d\n", v3 [i]);
    }
}





#include <stdio.h>
#include <stdlib.h>

void fillArray(int *arr) {
		    int i;
		    for (i = 0; i < 3; i++) {
			scanf("%d", &arr[i]);
		    }
		}

		void addArray(int *arr1, int *arr2, int *arr3) {
		    int i;
		    for (i = 0; i < 3; i++) {
			arr3[i] = arr1[i] + arr2[i];
			printf("Sum: %d\n", arr3[i]);
		    }
		}

		int main() {
		    int *v1, *v2, *v3;

		    v1 = malloc(sizeof(int) * 3);
		    v2 = malloc(sizeof(int) * 3);
		    v3 = malloc(sizeof(int) * 3);

		    printf("Enter numbers of first array: ");
		    fillArray(v1);

		    printf("Enter numbers of second array: ");
		    fillArray(v2);

		    printf("The sum of arrays are: ");
		    addArray(v1, v2, v3);

		    free(v1);
		    free(v2);
		    free(v3);
		    return 0;
}


