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
    int len, wid, index_1, index_2;
    float value [MHEIGHT] [MWIDTH];
    if ((f = fopen ("plottestdata.txt", "r")) == NULL)
        exit (1);
    if (fscanf (f, "%d%d", &len, &wid) != 2)
        exit (1);
    if (len < 1 || len > MHEIGHT || wid < 1 || wid > MWIDTH)
        exit (1);
    for (index_2 = 0; index_2 < len; index_2++)
        for (index_1 = 0; index_1 < wid; index_1++)
            if (fscanf (f, "%f", &value[index_2][index_1]) != 1)
                exit (1);
    fclose (f);
    for (index_2 = 0; index_2 < len; index_2++) {
        for (index_1 = 0; index_1 < wid; index_1++)
            printf ("%10.1f", value[index_2][index_1]);
        printf ("\n");
    }
    return 0;
}
