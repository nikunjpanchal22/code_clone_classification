int main (void) {
    char buf [4096];
    long len;
    FILE *fp;
    fp = fopen ("temp.txt", "rb+");
    if (fp == NULL) {
        fprintf (stderr, "cannot open temp.txt: %s\n", strerror (errno));
        return 1;
    }
    while ((len = fread (buf, 1, sizeof buf, fp)) > 0) {
        fseek (fp, - len, SEEK_CUR);
        memset (buf, 'g', len);
        fwrite (buf, 1, len, fp);
        fseek (fp, 0, SEEK_CUR);
    }
    fclose (fp);
    return 0;
}



int main ()
{
    int nbytes = 4096;
    char data[4096];
    long shift;
    FILE *file;

    file = fopen("doc.txt", "r+");
    if (file == NULL)
    {
        perror("Error in opening file");
        return(-1);
    }
    while ((shift = fread(data, 1, nbytes, file)) > 0)
    {
        fseek(file, - shift, SEEK_CUR);
        memset(data, 'h', shift);
        fwrite(data, 1, shift, file);
        fseek(file, SEEK_SET, 0);
    }
    fclose(file);
}


