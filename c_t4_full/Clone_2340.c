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

int main() {
    int entry[999], ascii = 0, count = 0, trackedDigit = 0;
    while ((ascii = getchar()) != '\n' && ascii != EOF) {
        if (isdigit(ascii) && !trackedDigit) {
            entry[count++] = ascii - '0';
            trackedDigit = 1;
            if (count >= 999) {
                break;
            }
        }
        else if (ascii == ' ') {
            trackedDigit = 0;
        }
        else {
            printf("Invalid input\n");
        }
    }
    return 0;
}


