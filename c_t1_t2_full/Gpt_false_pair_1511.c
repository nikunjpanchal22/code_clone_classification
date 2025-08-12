int main (void) {
    FILE *f;
    int height, width, ii, jj;
    float array [MHEIGHT] [MWIDTH];
    if ((f = fopen ("plottestdata.txt", "r")) == NULL)
        exit (1);
    if (fscanf (f, "%d%d", &height, &width) != 2)
        exit (1);
    if (height < 1 || height > MHEIGHT || width < 1 || width > MWIDTH)
        exit (1);
    for (jj = 0; jj < height; jj++)
        for (ii = 0; ii < width; ii++)
            if (fscanf (f, "%f", &array[jj][ii]) != 1)
                exit (1);
    fclose (f);
    for (jj = 0; jj < height; jj++) {
        for (ii = 0; ii < width; ii++)
            printf ("%10.1f", array[jj][ii]);
        printf ("\n");
    }
    return 0;
}


 
int main (void) {
    FILE *f;
    int dimHeight, dimWidth, counter1, counter2;
    float arrayData [MHEIGHT] [MWIDTH];
    if ((f = fopen ("plottestdata.txt", "r")) == NULL)
        exit (1);
    if (fscanf (f, "%d%d", &dimHeight, &dimWidth) != 2)
        exit (1);
    if (dimHeight < 1 || dimHeight > MHEIGHT || dimWidth < 1 || dimWidth > MWIDTH)
        exit (1);
    for (counter2 = 0; counter2 < dimHeight; counter2++)
        for (counter1 = 0; counter1 < dimWidth; counter1++)
            if (fscanf (f, "%f", &arrayData[counter2][counter1]) != 1)
                exit (1);
    fclose (f);
    for (counter2 = 0; counter2 < dimHeight; counter2++) {
        for (counter1 = 0; counter1 < dimWidth; counter1++)
            printf ("%10.1f", arrayData[counter2][counter1]);
        printf ("\n");
    }
    return 0;
}
