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
    int arr[999], cval = 0, arrLength = 0, isNewDigit = 0;
    while ((cval = getchar()) != '\n' && cval != EOF) {
        if (isdigit(cval) && !isNewDigit) {
            arr[arrLength++] = cval - '0';
            isNewDigit = 1;
            if (arrLength >= 999) {
                break;
            }
        }
        else if (cval == ' ') {
            isNewDigit = 0;
        }
        else {
            printf("Input format error!\n");
        }
    }
    return 0;
}


