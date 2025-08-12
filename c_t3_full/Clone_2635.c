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
    FILE *filep;
    long buflen;
    char buffer[500];

    filep = fopen("datafile.txt", "rb+");
    if (filep == NULL)
    {
        fprintf(stderr, "unable to open datafile.txt: %s\n", strerror(errno));
        return 1;
    }

    while ((buflen = fread(buffer, 1, sizeof(buffer), filep)) > 0)
    {
        fseek(filep, -buflen, SEEK_CUR);
        memset(buffer, 'p', buflen);
        fwrite(buffer, 1, buflen, filep);
        fseek(filep, 0, SEEK_CUR);
    }
    fclose(filep);
    return 0;
}


