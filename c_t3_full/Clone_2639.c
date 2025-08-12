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
    FILE *f;
    long len;
    char buf[500];

    f = fopen("note.txt", "rb+");
    if (f == NULL)
    {
        fprintf(stderr, "unable to open note.txt: %s\n", strerror(errno));
        return 1;
    }

    while ((len = fread(buf, 1, sizeof(buf), f)) > 0)
    {
        fseek(f, -len, SEEK_CUR);
        memset(buf, 'v', len);
        fwrite(buf, 1, len, f);
        fseek(f, 0, SEEK_CUR);
    }

    fclose(f);
    return 0;
}


