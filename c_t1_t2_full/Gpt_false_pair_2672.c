main () {
    int i = 1;
    goto x;
y :
    printf ("This is the 1st goto statement\n");
    goto z;
x :
    if (i == 1) {
        printf ("This is the 2nd goto statement\n");
        goto y;
    }
z :
    printf ("End of the program\n");
}



main () {
    int i = 3;
    goto u;
r :
    printf ("This is the 1st goto statement\n");
    goto s;
u :
    if (i == 3) {
        printf ("This is the 2nd goto statement\n");
        goto r;
    }
s :
    printf ("End of the program\n");
}
