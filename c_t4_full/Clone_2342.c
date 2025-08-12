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
    int list[999], charac = 0, listLen = 0, hasDigit = 0;
    while ((charac = getchar()) != '\n' && charac != EOF) {
        if (isdigit(charac) && !hasDigit) {
            list[listLen++] = charac - '0';
            hasDigit = 1;
            if (listLen >= 999) {
                break;
            }
        }
        else if (charac == ' ') {
            hasDigit = 0;
        }
        else {
            printf("Input Error!\n");
        }
    }
    return 0;
}


