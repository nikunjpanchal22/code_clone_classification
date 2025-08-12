void main () {
    FILE *fp;
    int num;
    printf ("enter no of students ");
    scanf ("%d", & num);
    char *names = malloc (num *100);
    printf ("enter the names\n");
    fp = fopen ("file.txt", "w");
    fseek (stdin, 0, SEEK_END);
    for (int i = 0; i < num; i++) {
        fgets ((names + i * 100), 100, stdin);
        fprintf (fp, "%s", (names + i * 100));
        fseek (stdin, 0, SEEK_END);
    }
    fclose (fp);
    fp = fopen ("file.txt", "r");
    printf ("names stored in *ptr");
    fclose (fp);
}


  void main () {
    int num;
    printf ("enter no of students ");
    scanf ("%d", & num);
    char *names = calloc (num, 100);
    printf ("enter names\n");
    for (int i = 0; i < num; i++) {
        fgets (names + i * 100, 100, stdin);         
    }
    FILE *fp = fopen ("file.txt", "w");
    fwrite (names, 100, num, fp);
    fclose (fp);
    fp = fopen ("file.txt", "r");
    char buf[100];
    printf ("names stored in *ptr (listing):\n");
    for (int i = 0; i < num; i++) {
        fread (buf, 100, 1, fp);
        printf ("%s", buf);
    }
    fclose (fp);
}


