int main () {
    int width;
    int breadth;
    scanf ("%d", & width);
    scanf ("%d", & breadth);
    if (width == 1 && breadth == 1) {
        printf ("#\n");
    }
    else {
        for (int i = 0; i < breadth; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || j == 0)
                    printf ("#");
                else if (i == (breadth - 1) || j == (width - 1))
                    printf ("#");
                else
                    printf (".");
            }
            printf ("\n");
        }
    }
    return 0;
}


 int main () {
    int width;
    int breadth;
    scanf ("%d", & width);
    scanf ("%d", & breadth);
    if (width == 1 && breadth == 1) {
        printf ("#\n");
    }
    else {
        int const width_const = width;
        int const breadth_const = breadth;
        for (int i = 0; i < breadth_const; i++) {
            for (int j = 0; j < width_const; j++) {
                if (i == 0 || j == 0)
                    printf ("#");
                else if (i == (breadth_const - 1) || j == (width_const - 1))
                    printf ("#");
                else
                    printf (".");
            }
            printf ("\n");
        }
    }
    return 0;
} 
