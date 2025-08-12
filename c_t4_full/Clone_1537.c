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





#include<cstdio>
#include<cstdbool>
int main (void) {
    int ch, numWords = 0, numLetters = 0;
    bool prevWasASpace = true;
    printf ("Enter a sentence: ");
    while ((ch = getchar()) != EOF && ch != '\n') {
        ch == ' ' ? prevWasASpace = true : ((prevWasASpace == true) ? numWords++ : numWords, prevWasASpace = false, numLetters++);
    }
    numWords > 0 ? printf ("Average word length: %.1f (C = %d, N = %d)\n", (float)numLetters / numWords, numLetters, numWords): printf ("You didn't enter any words\n");
    return 0;
}


