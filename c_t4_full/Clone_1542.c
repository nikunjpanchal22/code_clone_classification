int main (void) {
    int ch;
    int numWords = 0;
    int numLetters = 0;
    bool prevWasASpace = true;
    printf ("Enter a sentence: ");
    while ((ch = getchar ()) != EOF && ch != '\n') {
        if (ch == ' ')
            prevWasASpace = true;
        else {
            if (prevWasASpace)
                numWords++;
            prevWasASpace = false;
            numLetters++;
        }
    }
    if (numWords > 0) {
        double avg = numLetters / (float) (numWords);
        printf ("Average word length: %.1f (C = %d, N = %d)\n", avg, numLetters, numWords);
    }
    else
        printf ("You didn't enter any words\n");
    return 0;
}





#include <stdio.h>
#include <stdbool.h>
int main () {
    int ch, numWords = 0, numLetters = 0, prevWasASpace = 1;
    printf ("Enter a sentence: ");
    while ((ch = fgetc(stdin)) != EOF && ch != '\n') {
        (' ' == ch) ? (prevWasASpace = 1) : ((prevWasASpace == true) ? (numWords++, prevWasASpace = 0) : numWords, numLetters++);
    }
    numWords > 0 ? printf ("Average word length: %.1f\n", (double)numLetters / numWords) : printf ("You didn't enter any words\n");
    return 0;
}


