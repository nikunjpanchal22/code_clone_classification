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


	int main (void) 
{
    int array [100];
    int len, item;
    int index = 0;
    printf("Please input length of the array : ");
    scanf ("%d", & len);
    printf("Please input %d elements of array : ",len);
    scanf ("%d", & item);
    for (index = 0; index < len; index++) {
        scanf ("%d", & array [index]);
    }
    return 0;
}


