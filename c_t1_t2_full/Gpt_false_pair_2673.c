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
    int i = 2;
    goto v;
w :
    printf ("This is the 1st goto statement\n");
    goto y;
v :
    if (i == 2) {
        printf ("This is the 2nd goto statement\n");
        goto w;
    }
y :
    printf ("End of the program\n");
}
