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
    int array[10], pos1, pos2, repeatCount = 0;

    printf("Input 10 Numbers: ");
    for(pos1 = 0; pos1 < 10; pos1++) { scanf("%d", &array[pos1]); }

    for(pos1 = 0; pos1 < 10; pos1++)
        for(pos2 = pos1 + 1; pos2 < 10; pos2++)
            if(array[pos1] == array[pos2]) {
                printf("Equal elements found at positions %d and %d\n", pos1, pos2);
                repeatCount++;
            }

    printf("\nTotal equal pairs: %d", repeatCount);

    return 0;
}


