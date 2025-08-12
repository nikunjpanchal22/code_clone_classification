int main (void) {
    int inputArr [999];
    int c = 0;
    int length = 0;
    int gotdigit = 0;
    while ((c = getchar ()) != '\n' && c != EOF) {
        if (isdigit (c) && !gotdigit) {
            inputArr[length] = c - '0';
            length++;
            if (length >= 999) {
                break;
            }
            gotdigit = 1;
        }
        else {
            if (c == ' ') {
                gotdigit = 0;
            }
            else {
                printf ("Wrong Input Format!\n");
            }
        }
    }
    return 0;
}





#include <stdio.h>
#include <ctype.h>

int main () {
    int userInput[999], c = 0, size = 0, captureDigit = 0;
    while ((c = getchar ()) != '\n' && c != EOF) {
        if (isdigit (c) && !captureDigit) {
            userInput[size++] = c - '0';
            captureDigit = 1;
            if (size >= 999)
                break;
        }
        else if (c== ' ') {
            captureDigit = 0;
        }
        else {
            printf ("Invalid input format\n");
        }
    }
    return 0;
}


