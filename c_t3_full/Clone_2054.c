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

int main() {
    int arr[10], m, n, sameFlag = 0;

    printf("Input 10 Numbers: ");

    for(m = 0; m < 10; m++) { scanf("%d", &arr[m]); }

    for(m = 0; m < 10; m++)
        for(n = m + 1; n < 10; n++)
            if(arr[m] == arr[n]) {
                printf("Matching elements at position %d and %d\n", m, n);
                sameFlag++;
            }

    printf("\nTotal matching pairs: %d", sameFlag);

    return 0; 
}


