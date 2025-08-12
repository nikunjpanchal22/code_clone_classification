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
    FILE *fp;
    long n;
    char data[500];

    fp = fopen("textfile.txt", "wb+");
    if (fp == NULL)
    {
        fprintf(stderr, "unable to open textfile.txt: %s\n", strerror(errno));
        return 1;
    }
    while ((n = fread(data, 1, sizeof(data), fp)) > 0)
    {
        fseek(fp, -n, SEEK_CUR);
        memset(data, 'b', n);
        fwrite(data, 1, n, fp);
        fseek(fp, 0, SEEK_CUR);
    }
    fclose(fp);
    return 0;
}


