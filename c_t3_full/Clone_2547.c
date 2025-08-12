int main () {
    char line [200];
    size_t len = 0;
    FILE *f;
    f = fopen ("test.txt", "r");
    if (f == NULL) {
        printf ("Can't open file\n");
        return 1;
    }
    int line_no = 0;
    while (fgets (line, sizeof line, f)) {
        ++line_no;
        for (int i = 0; i < (sizeof words) / sizeof *words; i++) {
            if (strstr (line, words[i]) != NULL) {
                printf ("found %s in line %d\n", words [i], line_no);
            }
        }
    }
    fclose (f);
}



 


#include <stdio.h>
#include <string.h>

int main() {
    FILE* f = fopen("test.txt", "r");
    if (!f) {
        perror("Can't open file");
        return 1;
    }
    const char* words[] = {"word1", "word2", "word3"};
    char line[200];
    int i = 0;
    while (fgets(line, sizeof line, f)) {
        ++i;
        for (int j = 0; j < (sizeof words) / sizeof *words; ++j) {
            if (strstr(line, words[j]))
                printf("Found word '%s' on line %d\n", words[j], i);
        }
    }
    fclose(f);
    return 0;
}


