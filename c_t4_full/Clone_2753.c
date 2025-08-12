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
#include <inttypes.h>
#include <string.h>

void print_chunks(int64_t number) {
            char str [24];
            char buffer [5] = {0}, *ptr;
            int length, rem;
            length = sprintf (str, "%" PRId64, number);
            ptr = str;
            rem = length % 4;
            if (rem) {
                strlcpy (buffer, ptr, rem + 1);
                printf ("%s\n", buffer);
                length -= rem;
                ptr += rem;
            }
            while (length != 0) {
                strlcpy (buffer, ptr, 5);
                printf ("%s\n", buffer);
                length -= 4;
                ptr += 4;
            }
        }

        int main(void) {
            print_chunks(7029303290430LL);
            return 0;
}


