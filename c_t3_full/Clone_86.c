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
    int numbers[10];
    int matches = 0; 
	int i, j;
	
    printf("Please Enter 10 Numbers: \n\n");
    for (i = 0; i < 10; i++) 
		scanf("%d", &numbers[i]);
		
	for (i = 0; i < 10; i++) {
		for (j = 0; j < 10; j++) {
			if (i = j) {
				break;
			}
            else if (a[i]==a[j]) {
				matches++;
                printf("Values at position %d and %d are equal \n", i, j);
            }
        }
    }
	
	printf("The Equal Numbers In The Array Are = %d", matches);
	return 0;
	
}


