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
    char inputCharacter; float avg;
    int numWords = 0, lettersCount = 0;
    bool isPreviousCharSpace = true;
    printf("Type a Sentence: ");
    while ((inputCharacter = getchar()) != '\n') {
        if(inputCharacter == ' ' && !isPreviousCharSpace) { numWords++; isPreviousCharSpace = true; }
        else if(inputCharacter != ' ') { isPreviousCharSpace = false; lettersCount++; }
    }
    avg = (float) lettersCount / numWords;
    printf ("Average word length is: %.1f", avg);
    getch ();
    return 0;
}


