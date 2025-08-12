int main (void) {
    char sentence [] = "this is a sentence";
    char *newSentence = (char *) malloc (strlen (sentence) +1);
    int i, j, start, k;
    start = 0;
    for (i = 0;; i++) {
        if (sentence[i] == ' ' || sentence[i] == '\0') {
            char *word = (char *) malloc ((i - start) + 1);
            for (j = i - 1, k = 0; j >= start; j--, k++) {
                word[k] = sentence[j];
            }
            word[k++] = ' ';
            word[k] = '\0';
            strcat (newSentence, word);
            start = i + 1;
        }
        if (sentence[i] == '\0')
            break;
    }
    printf ("%s\n", newSentence);
    return 0;
}


 int main (void) {
    char sentence [] = "this is a sentence";
    char *newSentence = malloc (strlen (sentence) +1);
    int start = 0, end = 0;
    for (int i = 0; sentence[i]; i++) {
        if (sentence[i] == ' ') {
            end = i - 1;
            while (end >= start) {
                strncat (newSentence, &sentence[end], 1);
                end--;
            }
            strncat (newSentence, " ", 1);
            start = i + 1;
        } 
        else if (sentence[i + 1] == '\0') {
            end = i;
            while (end >= start) {
                strncat (newSentence, &sentence[end], 1);
                end--;
            }
            strncat (newSentence, "\0", 1);
        }
    }
    printf("%s\n", newSentence);
    return 0;
}


