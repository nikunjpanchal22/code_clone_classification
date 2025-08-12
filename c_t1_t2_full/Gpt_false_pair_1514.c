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
    int heightSize, widthSize, idx1, idx2;
    float valArray [MHEIGHT] [MWIDTH];
    if ((f = fopen ("plottestdata.txt", "r")) == NULL)
        exit (1);
    if (fscanf (f, "%d%d", &heightSize, &widthSize) != 2)
        exit (1);
    if (heightSize < 1 || heightSize > MHEIGHT || widthSize < 1 || widthSize > MWIDTH)
        exit (1);
    for (idx2 = 0; idx2 < heightSize; idx2++)
        for (idx1 = 0; idx1 < widthSize; idx1++)
            if (fscanf (f, "%f", &valArray[idx2][idx1]) != 1)
                exit (1);
    fclose (f);
    for (idx2 = 0; idx2 < heightSize; idx2++) {
        for (idx1 = 0; idx1 < widthSize; idx1++)
            printf ("%10.1f", valArray[idx2][idx1]);
        printf ("\n");
    }
    return 0;
}
