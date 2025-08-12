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


 main() {
    int i = 0;
    for (i = 0; i != 1; i++) {
        printf("This is the 2nd goto statement\n");
    }

y: 
    printf("This is the 1st goto statement\n");
    goto z;

z: 
    printf("End of the program\n");
}


