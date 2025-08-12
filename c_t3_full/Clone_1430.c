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


 void main()  {
     FILE *fp;
     int num;
     printf ("Enter number of students: ");
     scanf ("%d", &num);
     char* names[num];
     printf ("Enter the names\n");
     for (int i=0; i<num; i++){
         scanf("%s", names[i]);
     }
     printf("Names stored in *ptr\n");
     fp = fopen("file.txt","w");
     fwrite(names, 100, num, fp);
     fclose(fp);
     fp = fopen("file.txt","r");
     char buf[num * 100];
     fread(buf, sizeof(char), 100 * num, fp);
     for (int i=0; i<num; i++){
         printf("%s", buf+i * 100);
     }
     fclose(fp);
}


