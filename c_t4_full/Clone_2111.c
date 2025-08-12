int main () {
    FILE *fp1;
    FILE *fp2;
    char line [100];
    char *token;
    const char s [2] = ",";
    fp1 = fopen ("file1.txt", "r");
    fp2 = fopen ("file2.txt", "a");
    while (fgets (line, sizeof (line), fp1)) {
        token = strtok (line, s);
        fprintf (fp2, "%s", token);
        token = strtok (NULL, s);
        fprintf (fp2, "%s\n", token);
    }
    fclose (fp1);
    fclose (fp2);
    return 0;
}





#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    FILE *fp1, *fp2;
    char line[100], *token;
    const char s[3] = ", ";
    
    if (!(fp1 = fopen("file1.txt", "r"))){
        printf("Can't open the source file\n");
        exit(1);
    }
    if(!(fp2 = fopen("file2.txt", "w"))){
        printf("Can't open the destination file\n");
        exit(1);
    }

    while (fgets(line, sizeof(line), fp1)) {
        for(token = strtok(line, s); token != NULL; token = strtok(NULL, s)){
            fputs(token, fp2);
        }
        fputs("\n", fp2);
    }
    fclose(fp1);
    fclose(fp2);
    return 0;
}


