int main () {
    FILE *f = fopen ("test.txt", "r");
    char word [MAX_LENGTH];
    int length = strlen (word);
    int i, j, k, flag = 0;
    fgets (word, MAX_LENGTH, f);
    for (i = 0; i < length; i++) {
        if (word[i] == " ") {
            flag = 0;
            j = i;
            for (k = i; word[k] != " "; k++) {
                if (word[i] == 'a' | word[i] == 'e' | word[i] == 'i' | word[i] == 'o' | word[i] == 'u' | word[i] == 'y') {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                for (i = i; i <= k; i++)
                    printf ("%c", word[i]);
        }
    }
}





#include<stdio.h>
#include<string.h>
#define MAX_LENGTH 256
int main() {
    FILE *f = fopen("test.txt", "r");
    char word[MAX_LENGTH];
    fgets(word, MAX_LENGTH, f);
    int length = strlen(word);
    int flag = 0;
    for (int i = 0; i < length; i++) {
        if (word[i] == ' ') {
            flag = 0;
            int j = i;
            for (int k = i+1; word[k] != ' '; k++) {
                if (strchr("aeiouy", word[k]) != NULL) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                for(j = j+1; j <= i; j++)
                    printf ("%c", word[j]);
        }
    }
    fclose(f);
    return 0;
}


