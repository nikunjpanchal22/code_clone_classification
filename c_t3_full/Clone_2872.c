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
#include <string.h>
#include <inttypes.h>

int main() {
    int64_t n = 30043049043LL;
    char buffer[24], *current, section[5] = {0};
    size_t len, rem;

    len = snprintf(buffer, sizeof buffer, "%" PRId64, n);
    current = buffer;

    rem = len % 4;
    if (rem) {
        strncpy(section, current, rem);
        printf("%s\n", section);
        len -= rem;
        current += rem;
    }

    memset(section, 0, sizeof section);
    while (len) {
        strncpy(section, current, 4);
        printf("%s\n", section);
        len -= 4;
        current += 4;
    }

    return 0;
}


