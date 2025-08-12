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
    int i = 1;
    goto q;
x :
    if (i == 1) {
        printf ("This is x\n");
        goto y;
    }
z :
    printf ("program end\n");
    return;
y :
    printf ("This is y\n");
    goto z;
q :
    printf ("This is q\n");
    goto x;
}


