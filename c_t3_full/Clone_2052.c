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
    int storage[10], p, q, duplicates = 0;

    printf("Provide 10 Numbers:");

    for(p=0; p<10; p++) { scanf("%d", &storage[p]); }

    for(p=0; p<10; p++)
        for(q = p+1; q < 10; q++)
            if(storage[p] == storage[q]) {
                printf("Matching elements at locations %d and %d\n", p, q);
                duplicates++;
            }
    printf("\nTotal duplicate pairs = %d", duplicates);
    return 0;
}


