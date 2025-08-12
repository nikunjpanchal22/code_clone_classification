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
int main() {
    int ch, numWords = 0, numLetters = 0;
    bool prevWasASpace = true;
    printf("Enter a sentence: ");
    while ((ch = getchar()) != EOF && ch != '\n') {
        if (ch == ' ') prevWasASpace = true;
        else {
            if (prevWasASpace) numWords++;
            prevWasASpace = false; numLetters++;
        }
    }
    printf(numWords > 0 ? "Average word length: %.1f\n" : "You didn't enter any words\n", numWords > 0 ? (float)numLetters / numWords : 0);
    return 0;
}


