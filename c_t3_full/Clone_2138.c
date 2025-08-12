int main () {
    int i;
    char A [6] [10] = {"John", "David", "Michael", "Steve", "Sam", "Claire"};
    int B [6] = {12, 30, 12, 12, 19, 12};
    int C [6] = {2, 1, 2, 1, 2, 1};
    for (i = 0; i < 6; i++)
        printf ("%s\t%d\t%d\n", A[i], B[i], C[i]);
    printf ("\n");
    sortarray (6, A, B, C);
    for (i = 0; i < 6; i++)
        printf ("%s\t%d\t%d\n", A[i], B[i], C[i]);
}





int main () {
	    int i;
	    char *A[6] = {"John", "David", "Michael", "Steve", "Sam", "Claire"};
	    int B[6] = {12, 30, 12, 12, 19, 12};
	    int C[6] = {2, 1, 2, 1, 2, 1};
	    for (i = 0; i < sizeof(B)/sizeof(B[0]); i++)
		printf ("%s\t%d\t%d\n", A[i], B[i], C[i]);
	    printf ("\n");
	    sortarray (6, A, B, C);
	    for (i = 0; i < sizeof(B)/sizeof(B[0]); i++)
		printf ("%s\t%d\t%d\n", A[i], B[i], C[i]);
}


