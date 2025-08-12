int main () {
    char line [1024];
    FILE *fp = fopen ("filename.txt", "r");
    if (fp == NULL) {
        return 1;
    }
    while (fgets (line, 1024, fp)) {
        printf ("%s\n", line);
    }
    return 0;
}





#include <stdio.h>

int main() {
        FILE *pf = fopen("filename.txt", "r");
        char buff[1024];

        if (!pf) {
            return 1;
        }

        while (fgets(buff, 1024, pf) != NULL) {
            printf("%s", buff);
        }

        fclose(pf);

        return 0;
}


