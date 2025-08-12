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
    int dimH, dimW, p, q;
    float mat [MHEIGHT] [MWIDTH];
    if ((f = fopen ("plottestdata.txt", "r")) == NULL)
        exit (1);
    if (fscanf (f, "%d%d", &dimH, &dimW) != 2)
        exit (1);
    if (dimH < 1 || dimH > MHEIGHT || dimW < 1 || dimW > MWIDTH)
        exit (1);
    for (q = 0; q < dimH; q++)
        for (p = 0; p < dimW; p++)
            if (fscanf (f, "%f", &mat[q][p]) != 1)
                exit (1);
    fclose (f);
    for (q = 0; q < dimH; q++) {
        for (p = 0; p < dimW; p++)
            printf ("%10.1f", mat[q][p]);
        printf ("\n");
    }
    return 0;
}
