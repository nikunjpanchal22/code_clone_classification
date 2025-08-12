int main (void) {
    char s [1000], alp [1000];
    int num [1000];
    int m = 0, n = 0;
    int i, j;
    unsigned char ch;
    scanf ("%999[^\n]", s);
    for (i = 0; ch = s[i]; i++) {
        if (isalpha (ch)) {
            alp[n++] = s[i];
        }
        else if (isdigit (ch)) {
            num[m] = 0;
            while (isdigit (ch = s[i])) {
                num[m] = num[m] * 10 + s[i] - '0';
                ++i;
            }
            ++m;
            --i;
        }
        else {
            printf ("include invalid character (%c).\n", ch);
            return -1;
        }
    }
    for (i = 0; i < m; i++) {
        for (j = 0; j < num[i]; j++)
            printf ("%c", alp[i]);
    }
    puts ("");
    return 0;
}




#include <stdio.h>
#include <ctype.h>

int main() {
    unsigned char ch;
    int m = 0, n = 0, i, j;
    char s[1000], alp[1000];
    int num[1000] = {0};
    fgets(s, sizeof(s), stdin);

    for (i = 0; (ch = s[i]) != 0; i++) {
        if (isalpha(ch)) alp[n++] = ch;
        else if (isdigit(ch)) {
            do {
                num[m] = num[m] * 10 + s[i++] - '0';
            } while (isdigit(s[i]));
            m++;
        } else {
            printf("Invalid character: %c\n", ch);
            return -1;
        }
    }

    for (i = 0; i < m; i++) {
        for (j = 0; j < num[i]; ++j) printf("%c", alp[i]);
    }

    return 0;
}


