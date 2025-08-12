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


int main (void) {
    char buf [4096];
    long len;
    FILE *fp;
    fp = fopen ("temp.txt", "wb+");
    if (fp == NULL) {
        fprintf (stderr, "cannot open temp.txt: %s\n", strerror (errno));
        return 1;
    }
    while ((len = fread (buf, 1, sizeof buf, fp)) > 0) {
        fseek (fp, - len, SEEK_END);
        memset (buf, 'X', len);
        fwrite (buf, 1, len, fp);
        fseek (fp, 0, SEEK_END);
    }
    fclose (fp);
    return 0;
}
