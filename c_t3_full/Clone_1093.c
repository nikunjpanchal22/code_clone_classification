int main (void) {
    FILE *fp;
    fp = fopen ("write.txt", "w");
    if (fp == NULL) {
        printf ("File not created okay, errno = %d\n", errno);
        return 1;
    }
    fclose (fp);
    printf ("File created okay\n");
    return 0;
}


 int main (void) {
    FILE *fp;
    if ( (fp = fopen("write.txt", "w")) == NULL) {
        perror ("File not created okay, errno = ");
        return 1;
    }
    fclose(fp);
    printf ("File created okay\n");
    return 0;
}


