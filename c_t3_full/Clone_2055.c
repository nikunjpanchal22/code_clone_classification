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
    int magicalArr[10], counterOne, counterTwo, duplicateCount = 0;

    printf("Input 10 Numbers: ");
    for(counterOne = 0; counterOne < 10; counterOne++) { scanf("%d", &magicalArr[counterOne]); }

    for(counterOne = 0; counterOne < 10; counterOne++)
        for(counterTwo = counterOne+1; counterTwo < 10; counterTwo++)
            if(magicalArr[counterOne] == magicalArr[counterTwo]) {
                printf("Same items found at positions %d and %d\n", counterOne, counterTwo);
                duplicateCount++;
            }

    printf("\nTotal duplicate pairs: %d", duplicateCount);

    return 0;
}


