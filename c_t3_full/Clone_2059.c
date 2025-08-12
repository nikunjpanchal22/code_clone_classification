int main () {
    int a [10], i, j, flag = 0;
    printf ("Please Enter 10 Numbers");
    for (i = 0; i < 10; i++)
        scanf ("%d", &a[i]);
    for (i = 0; i < 10; i++) {
        for (j = i + 1; j < 10; j++) {
            if (a[i] == a[j]) {
                flag++;
                printf ("Array Element %d and %d are equal", i, j);
            }
        }
    }
    printf ("\nThe Equal Numbers In The Array Are = %d", flag);
    return 0;
}





#include<stdio.h>

void main() {
    int arr[10], k, l, marker = 0;

    printf("Input 10 Numbers: ");

    for (k = 0; k < 10; k++) { scanf("%d", &arr[k]); }

    for (k = 0; k < 10; k++)
        for (l = k+1; l < 10; l++) {
            if (arr[k] == arr[l]) {
                printf("\nDuplicate elements at locations %d and %d", k, l);
                marker++;
            }
        }
    printf("\nNumber of Duplicates in Array = %d", marker);
}


