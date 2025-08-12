int main (void) {
    char *a [50];
    int i = 0;
    for (i = 0; i < 50; ++i)
        a[i] = malloc (10);
    function (a);
    printf ("a[0]: %s\n", a [0]);
    printf ("a[1]: %s\n", a [1]);
}


 
int main (void){
    char a[50][10];
    int i = 0;
    for (i = 0; i < 50; ++i)
        memset(a[i], 0, 10);
    function (a);
    printf ("a[0]: %s\n", a [0]);
    printf ("a[1]: %s\n", a [1]);
}
