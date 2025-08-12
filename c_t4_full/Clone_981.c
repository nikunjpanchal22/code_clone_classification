int main (void) {
    char userName [10];
    char names [20];
    printf ("\n\n\n\nPlease enter your name: ");
    scanf ("%s", userName);
    FILE *fp;
    fp = fopen ("results.dat", "r");
    if (fp == NULL) {
        printf ("I couldn't open results.dat for writing.\n");
        exit (0);
    }
    while (fgets (names, 20, fp)) {
        names[strlen (names) - 1] = '\0';
        if (strcmp (names, userName) == 0) {
            printf ("Match found\n");
        }
    }
    return 0;
}





#include<stdio.h>
int main(void){
    char userName[10];
    char names[20];
    printf("Please enter your name: ");
    scanf("%s", &userName);
    FILE *fp = fopen("results.dat", "r");
    if(!fp){printf("Can't open the file\n");exit(0);}
    while(fread(names, 20, 1, fp)){
        names[strlen(names) - 1] = 0;
        if(!strcmp(names, userName)) printf("Match found!\n");
    }
    fclose(fp);
}


