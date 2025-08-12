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
    int size = width*breadth;
    if (size < 5) {
        printf ("#\n");
    }
    else {
        int i = 0;
        while (i < size){
            if (i < width || i < width*2 || i > (size - width) || i > (size - width*2))
                printf ("#");
            else
                printf (".");
            i++;           
            if (i % width == 0) 
                printf ("\n");
        }
    }
    return 0;
}


