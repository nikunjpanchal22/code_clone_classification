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
    int fd;
    fd = open ("write.txt", O_WRONLY | O_CREAT, 0644);
    if (fd == -1) {
        printf ("File not created okay, errno = %d\n", errno);
        return 1;
    }
    close (fd);
    printf ("File created okay\n");
    return 0;
}


