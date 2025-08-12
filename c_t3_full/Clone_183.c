int main (void) {
    int a [100];
    int n, x;
    int i = 0;
    scanf ("%d%d", & n, & x);
    for (i = 0; i < n; i++) {
        scanf ("%d", & a [i]);
    }
    return 0;
}


 int main (void) {
    int arrayVariable [100];
    int numOfElements, singleNum;
    int index = 0;
    printf("Please enter the size of array : ");
    scanf ("%d", & numOfElements);
    printf("Enter %d elements of array : ",numOfElements);
    scanf ("%d", & singleNum);
    for (index = 0; index < numOfElements; index++) {
        scanf ("%d", & arrayVariable [index]);
    }
    return 0;
}


