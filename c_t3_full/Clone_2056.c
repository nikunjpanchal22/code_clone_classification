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
    int magicArray[10], c1, c2, equalItems = 0;

    printf("Input 10 Numbers: ");
    for(c1 = 0; c1 < 10; c1++) { scanf("%d", &magicArray[c1]); }

    for(c1 = 0; c1 < 10; c1++)
        for(c2 = c1 + 1; c2 < 10; c2++)
            if(magicArray[c1] == magicArray[c2]) {
                printf("Identical items found at positions %d and %d\n", c1, c2);
                equalItems++;
            }

    printf("\nTotal identical pairs: %d", equalItems);

    return 0;
}


