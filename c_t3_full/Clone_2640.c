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
    FILE *filePointer;
    char buf [500];
    int length;

    filePointer = fopen ("data.txt", "ab+");
    if (filePointer == NULL)
    {
        fprintf(stderr, "unable to open data.txt: %s\n", strerror(errno));
        return 2;
    }

    while ((length = fread(buf, 1, sizeof buf, filePointer)) > 0)
    {
        fseek(filePointer, - length, SEEK_CUR);
        memset (buf, 'l', length);
        fwrite(buf, 1, length, filePointer);
        fseek(filePointer, 0, SEEK_CUR);
    }

    fclose(filePointer);
}


