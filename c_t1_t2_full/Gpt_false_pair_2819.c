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


int main (void) {
    int ch;
    int numWords = 0;
    int numLetters = 0;
    bool prevWasASpace = true;
    printf ("Type a sentence: ");
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
        printf ("Average word size: %.1f (total characters C = %d, total words N = %d)\n", avg, numLetters, numWords);
    }
    else
        printf ("No words were entered\n");
    return 0;
}
