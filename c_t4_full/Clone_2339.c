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
    int input[999], val = 0, len = 0, digitDetected = 0;
    while ((val = getchar ()) != '\n' && val != EOF) {
        if (isdigit (val) && !digitDetected) {
            input[len++] = val - '0';
            digitDetected = 1;
            if (len >= 999)
                break;
        }
        else if (val == ' ') {
            digitDetected = 0;
        }
        else {
            printf ("Incorrect Input Format!\n");
        }
    }
    return 0;
}


