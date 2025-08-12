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
    int h, w, i, j;
    float arr [MHEIGHT] [MWIDTH];
    if ((f = fopen ("plottestdata.txt", "r")) == NULL)
        exit (1);
    if (fscanf (f, "%d%d", &h, &w) != 2)
        exit (1);
    if (h < 1 || h > MHEIGHT || w < 1 || w > MWIDTH)
        exit (1);
    for (j = 0; j < h; j++)
        for (i = 0; i < w; i++)
            if (fscanf (f, "%f", &arr[j][i]) != 1)
                exit (1);
    fclose (f);
    for (j = 0; j < h; j++) {
        for (i = 0; i < w; i++)
            printf ("%10.1f", arr[j][i]);
        printf ("\n");
    }
    return 0;
}
