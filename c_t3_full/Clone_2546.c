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
    FILE *f;
    char line[200];
    const char* words[] = { "word1", "word2", "word3" };
    f = fopen("test.txt", "r");
    if(f == NULL){
        printf("Can't open file\n");
        return 1;
    }
    int lineCount = 0;
    while (fgets(line, sizeof(line), f) != NULL){
        lineCount++;
        for(int i=0; i<sizeof(words)/sizeof(words[0]); i++){
            if(strstr(line, words[i]) != NULL){
                printf("Found word '%s' in line %d\n", words[i], lineCount);
            }
        }
    }
    fclose(f);
    return 0;
}


