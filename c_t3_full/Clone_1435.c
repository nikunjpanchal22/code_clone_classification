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


 void main() {
   FILE *fp;
   int num;
   printf ("enter no of students ");
   scanf ("%d", &num);
   char names[num][100];
   printf ("enter the names\n");
   fp = fopen ("file.txt", "w");
   for (int i = 0; i < num; i++) {
       fgets (names[i], 100, stdin);
       fprintf (fp, "%s",names[i]);
   }
   fclose (fp);
   fp = fopen ("file.txt", "r");
   printf ("names stored in *ptr\n");
   for (int i = 0; i < num; i++) {
       fgets (names [i], 100, fp);
       printf ("%s", names [i]);
   }
   fclose (fp);
}


