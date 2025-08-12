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





#include<stdio.h>
#include<conio.h>
int main () {
    char c; float avg; int nw, nl;
    nw = nl = 0; bool ws = true;
    printf ("Enter text: ");
    while ((c = getchar()) != '\n') {
        (ws = (c == ' ')) ? (ws != true) ? (nw++, ws = true) : ws = false : nl++;
    }
    avg = (float) nl / nw;
    printf ("Average word length: %.1f", avg);
    getch();
    return 0;
}


