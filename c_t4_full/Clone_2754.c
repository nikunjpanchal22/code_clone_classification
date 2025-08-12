int main (void) {
    int64_t number = 2001000200030LL;
    char data [24];
    char digit [5] = {0}, *p;
    int len, r;
    len = sprintf (data, "%lld", number);
    p = data;
    r = len % 4;
    if (r) {
        strncpy (digit, p, r);
        printf ("%s\n", digit);
        len -= r;
        p += r;
    }
    while (len != 0) {
        strncpy (digit, p, 4);
        printf ("%s\n", digit);
        len -= 4;
        p += 4;
    }
    return 0;
}




#include <stdio.h>
#include <stdint.h>
#include <string.h>

void printNumberChunks(int64_t number) {
            char buffer[24] = {0}, chunk[5] = {0};
            int length, remainder;

            length = sprintf(buffer, "%" PRId64, number);
            char* pointer = buffer;
            remainder = length % 4;

            if (remainder) {
                strncpy(chunk, pointer, remainder);
                printf("%s\n", chunk);
                length -= remainder;
                pointer += remainder;
            }

            while (length) {
                strncpy(chunk, pointer, 4);
                printf("%s\n", chunk);
                length -= 4;
                pointer += 4;
            }
        }

        int main(void) {
            printNumberChunks(7403930430LL);
            return 0;
}


