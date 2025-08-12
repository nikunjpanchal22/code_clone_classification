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
    char A [6] [10] = {"John", "David", "Michael", "Steve", "Sam", "Claire"};
    int B [6] = {12, 30, 12, 12, 19, 12};
    int C [6] = {2, 1, 2, 1, 2, 1};
    int temp;
    char tempchar[10];
    for (i = 0; i < 6; i++) 
        printf ("%s\t%d\t%d\n", A[i], B[i], C[i]);
    printf ("\n");
    for(int x = 0; x < 6; x++){ 
        for(int y = 0; y < 6; y++){
            if(C[x] < C[y]){
                temp = C[x];
                C[x] = C[y];
                C[y] = temp;
                temp = B[x];
                B[x] = B[y];
                B[y] = temp;
                strcpy(tempchar, A[x]);
                strcpy(A[x], A[y]);
                strcpy(A[y], tempchar);
            }
            else if(C[x] == C[y] && B[x] > B[y]){
                temp = C[x];
                C[x] = C[y];
                C[y] = temp;
                temp = B[x];
                B[x] = B[y];
                B[y] = temp;
                strcpy(tempchar, A[x]);
                strcpy(A[x], A[y]);
                strcpy(A[y], tempchar);
            }
        }
    }
    for (i = 0; i < 6; i++) 
        printf ("%s\t%d\t%d\n", A[i], B[i], C[i]);
}


