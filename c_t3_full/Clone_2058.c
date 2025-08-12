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

main() {
    int b[10], x, y, duplicateFlag = 0;

    printf("Enter 10 Numbers:");

    for(x = 0; x < 10; x++) { scanf("%d", &b[x]); }

    for(x = 0; x < 10; x++)
        for(y = x + 1; y < 10; y++)
            if(b[x] == b[y]) {
                printf("Identical elements at position %d and %d\n", x, y);
                duplicateFlag++;
            }

    printf("\nTotal identical pairs: %d", duplicateFlag);

}


