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
    int fd = 0;
    fd = open("write.txt", O_TRUNC | O_RDWR | O_CREAT);
    if(fd == -1) {
        fprintf(stderr, "File not created okay, errno = %d \n", errno);
        return EXIT_FAILURE;
    }
    close(fd);
    printf("File created okay\n");
    return EXIT_SUCCESS;
}


