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
    char block[500];
    FILE *fpr;
    long l;

    fpr = fopen("filename.txt", "rb+");
    if (fpr == NULL)
    {
        fprintf(stderr, "unable to open filename.txt: %s\n", strerror(errno));
        return 1;
    }
    while ((l = fread(block, 1, sizeof(block), fpr)) > 0)
    {
        fseek(fpr, -l, SEEK_CUR);
        memset(block, 'e', l);
        fwrite(block, 1, l, fpr);
        fseek(fpr, 0, SEEK_CUR);
    }
    fclose(fpr);
    return 0;
}


