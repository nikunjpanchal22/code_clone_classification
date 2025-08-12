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
    int rows, columns, count1, count2;
    float ary [MHEIGHT][MWIDTH];
    if ((f = fopen ("plottestdata.txt", "r")) == NULL)
        exit (1);
    if (fscanf (f, "%d%d", &rows, &columns) != 2)
        exit (1);
    if (rows < 1 || rows > MHEIGHT || columns < 1 || columns > MWIDTH)
        exit (1);
    for (count1 = 0; count1 < rows; count1++)
        for (count2 = 0; count2 < columns; count2++)
            if (fscanf (f, "%f", &ary[count1][count2]) != 1)
                exit (1);
    fclose (f);
    for (count1 = 0; count1 < rows; count1++) {
        for (count2 = 0; count2 < columns; count2++)
            printf ("%10.1f", ary[count1][count2]);
        printf ("\n");
    }
    return 0;
}
