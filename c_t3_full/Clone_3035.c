int main () {
    int n, c, d, position, swap;
    printf ("Enter number of elements\n");
    scanf ("%d", & n);
    int array [n];
    printf ("Enter %d integers\n", n);
    for (c = 0; c < n; c++)
        scanf ("%d", &array[c]);
    for (c = 0; c < (n - 1); c++) {
        position = c;
        for (d = c + 1; d < n; d++) {
            if (array[position] > array[d])
                position = d;
        }
        if (position != c) {
            swap = array[c];
            array[c] = array[position];
            array[position] = swap;
        }
    }
    printf ("Sorted list in ascending order:\n");
    for (c = 0; c < n; c++)
        printf ("%d\n", array[c]);
    return 0;
}



 

#include<stdio.h>
void main() {
    int i, j, a, n, arr[30];
    printf("Enter the number of elements : ");
    scanf("%d", &n);
    printf("\nEnter the elements of the array : ");
    for (i = 0; i < n; i++)
        scanf("%d", &arr[i]);
    for (i = 0; i < n-1; i++) {
        for (j = i+1; j < n; j++) {
            if (arr[i] > arr[j]) {
                a = arr[i];
                arr[i] = arr[j];
                arr[j] = a;
            }
        }
    }
    printf("\nThe array sorted in ascending order is :\n");
    for (i = 0; i < n; i++)
        printf("%d ", arr[i]);
}


