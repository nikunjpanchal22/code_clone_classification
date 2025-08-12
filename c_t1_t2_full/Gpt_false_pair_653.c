int main () {
    char ch;
    float avg;
    int numWords = 0;
    int numLetters = 0;
    bool prevWasASpace = true;
    printf ("Enter a sentence: ");
    while ((ch = getchar ()) != '\n') {
        if (ch != ' ') {
            prevWasASpace = false;
            numLetters++;
        }
        else if (ch == ' ' && !prevWasASpace) {
            numWords++;
            prevWasASpace = true;
        }
    }
    avg = numLetters / (float) (numWords);
    printf ("Average word lenth: %.1f", avg);
    getch ();
}


 
int main () {
    char ch;
    float avg;
    int numWords = 0;
    int numLetters = 0;
    bool prevWasASpace = true;
    printf ("Enter a sentence: ");
    while ((ch = getchar ()) != '\n') {
        if (ch != ' ') {
            prevWasASpace = false;
            numLetters += 1;
        }
        else if (ch == ' ' && !prevWasASpace) {
            numWords += 1;
            prevWasASpace = true;
        }
    }
    avg = (float) numLetters / numWords;
    printf ("Average word lenth: %.1f", avg);
    getchar ();
}
