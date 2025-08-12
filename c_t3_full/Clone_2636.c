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
    long len;
    FILE *fp;
    char arr[500];

    fp = fopen("item.dat", "wb+");

    if (fp == NULL)
    {
        fprintf(stderr, "unable to open item.dat: %s\n", strerror(errno));
        return 1;
    }

    while ((len = fread(arr, 1, sizeof(arr), fp)) > 0)
    {
        fseek(fp, -len, SEEK_CUR);
        memset(arr, 'z', len);
        fwrite(arr, 1, len, fp);
        fseek(fp, 0, SEEK_CUR);
    }
    fclose(fp);

    return 0;
}


