int main (void) {
    size_t i, j, k;
    int s3;
    int arr1 [] = {1, 2, 3, 4, 7, 8, 9};
    int arr2 [] = {3, 4, 5};
    size_t s1 = sizeof (arr1) / sizeof (int);
    size_t s2 = sizeof (arr2) / sizeof (int);
    int arr3 [s1];
    int e;
    int found = 0;
    k = 0;
    for (i = 0; i < s1; i++) {
        e = arr1[i];
        found = 0;
        for (j = 0; j < s2; j++) {
            if (e == arr2[j]) {
                found = 1;
                break;
            }
        }
        if (found == 0) {
            arr3[k] = e;
            k++;
        }
    }
    printf ("arr1 has %d elements:\n", s1);
    for (i = 0; i < s1; i++) {
        printf ("%d ", arr1 [i]);
    }
    printf ("\narr2 has %d elements:\n", s2);
    for (i = 0; i < s2; i++) {
        printf ("%d ", arr2 [i]);
    }
    printf ("\narr3 has %d elements:\n", k);
    for (i = 0; i < k; i++) {
        printf ("%d ", arr3 [i]);
    }
    return 0;
}





#include <stdio.h>
#include <stdlib.h>

int main() {
	    int arr1[] = {1, 2, 3, 4, 5, 6, 7};
	    int arr2[] = {3, 1, 5};
	    int *arr3 = malloc(7 * sizeof(int));
	    int presentInSecondArray;
	    int i, j, k = 0;

	    for(i = 0; i < 7; i++)
	    {
		presentInSecondArray = 0;

		for(j = 0; j < 3; j++)
		{
		    if(arr1[i] == arr2[j])
		    {
		        presentInSecondArray = 1;
		        break;
		    }
		}

		if(!presentInSecondArray)
		{
		    arr3[k++] = arr1[i];
		}
	    }

	    for(i = 0; i < k; i++)
	    {
		printf("%d ", arr3[i]);
	    }


	    return 0;
}


