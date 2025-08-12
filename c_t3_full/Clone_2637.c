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
    char text[500];
    long nbytes;
    
    fp = fopen("file.dat", "wb+");
    
    if (fp == NULL)
    {
        fprintf(stderr, "unable to open file.dat: %s\n", strerror(errno));
        return 1;
    }

    while ((nbytes = fread(text, 1, sizeof(text), fp)) > 0)
    {
        fseek(fp, -nbytes, SEEK_CUR);
        memset(text, 't', nbytes);
        fwrite(text, 1, nbytes, fp);
        fseek(fp, 0, SEEK_CUR);
    }
    fclose(fp);
    return 0;
}


