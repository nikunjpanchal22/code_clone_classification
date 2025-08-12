void main () {
    int i, j;
    int arr [5] [5] = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
    printf ("Sizeof(arr) : %d\n", sizeof (arr));
    printf ("Sizeof(arr[0]) : %d\n", sizeof (arr [0]));
    for (int i = 0; i < (sizeof (arr) / sizeof (arr[0])); i++) {
        for (int j = 0; j < (sizeof (arr[0]) / sizeof (arr[0][0])); j++)
            arr[i][j] += 1;
    }
    for (int i = 0; i < (sizeof (arr) / sizeof (arr[0])); i++) {
        for (int j = 0; j < (sizeof (arr[i]) / sizeof (arr[0][0])); j++)
            printf ("%d ", arr[i][j]);
        printf ("\n");
    }
    printf ("\n");
}






void main () 
{
	    int arr [5][5] = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
	    int i;
	    int j;
	    for (i = 0; i < 5; i++) 
	    {
		for (j = 0; j < 5; j++)
		arr[i][j] += 1;
	    }
	    for (i = 0; i < 5; i++) 
	    {
		for (j = 0; j < 5; j++)
		printf("%d ", arr[i][j]);
		printf ("\n");
	    }
}


