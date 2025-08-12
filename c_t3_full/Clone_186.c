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
    int arrayVariable1 [100];
    int size_given, element;
    int iterator = 0;
    printf("Input the total size of the array : ");
    scanf ("%d", & size_given);
    printf("Enter %d elements of the array : ",size_given);
    scanf ("%d", & element);
    for (iterator = 0; iterator < size_given; iterator++) {
        scanf ("%d", & arrayVariable1 [iterator]);
    }
    return 0;
}


