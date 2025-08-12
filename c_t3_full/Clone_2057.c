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
    int nums[10], i, j, cnt = 0;

    printf("Enter 10 numbers: ");

    for(i=0; i<10; i++) { scanf("%d", &nums[i]); }

    for(i=0; i<10; i++)
        for(j=i+1; j<10; j++)
            if(nums[i] == nums[j]) {
                printf("Identical elements found at locations %d and %d\n", i, j);
                cnt++;
            }
    printf("\nTotal Identical pairs = %d", cnt);

    return 0;
}


