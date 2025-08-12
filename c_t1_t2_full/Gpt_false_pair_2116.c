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
    while (i == 0) {
        printf("This is the 2nd goto statement\n");
        i = 1;
        goto y;
    }

y: 
    printf("This is the 1st goto statement\n");
    goto z;

z: 
    printf("End of the program\n");
    
}
