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
    FILE *fp = NULL;
    int open_check = 0;
    open_check = fopen_s (&fp, "write.txt", "w");
    if (open_check) {
        printf ("File not created okay, errno = %d\n", open_check);
        return 1;
    }
    fclose (fp);
    printf ("File created okay\n");
    return 0;
}


