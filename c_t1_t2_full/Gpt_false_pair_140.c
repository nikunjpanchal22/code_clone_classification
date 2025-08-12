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


  int main () {
    int a[10], i, j, flag = 0;
    printf("Please Enter 10 Numbers: \n");
    for (i = 0; i < 10; i++) {
        scanf("%d", &a[i]);
    } 
    for (i = 0; i < 10; i++) {
        for (j = i + 1; j < 10; j++) {
            if (a[i] == a[j]) {
                flag++;
                printf("Array Element %d and %d are equal \n", i, j);
            }
        }
    }
    printf("The total number of equal elements in the array is %d", flag);
    return 0;
}
