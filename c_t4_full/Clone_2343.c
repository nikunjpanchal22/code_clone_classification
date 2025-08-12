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

int main(void) {
    int array[999], ch = 0, len = 0, digitCaptured = 0;
    while ((ch = getchar()) != '\n' && ch != EOF) {
        if (isdigit(ch) && !digitCaptured) {
            array[len++] = ch - '0';
            digitCaptured = 1;
        }
        else if (ch == ' ') {
            digitCaptured = 0;
        }
        else {
            puts("Error in input format");
        }
    }
    return 0;
}


