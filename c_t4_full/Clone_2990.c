int main (int argc, char **argv) {
    wint_t letter = L '\0';
    setlocale (LC_ALL, "");
    while (1) {
        if (!letter)
            printf ("Type a letter to get its position: ");
        letter = fgetwc (stdin);
        if (letter == WEOF) {
            putchar ('\n');
            return 0;
        }
        else if (letter == L'\n' || letter == L'\r') {
            letter = L'\0';
        }
        else {
            printf ("%d\n", letter);
        }
    }
    return 0;
}









 
#include <locale.h>
#include <stdio.h>
#include <wchar.h>

int main () {
    setlocale (LC_ALL, "");
    for (wint_t letter; (letter = getwchar()) != WEOF;)
        if (letter != L'\n' && letter != L'\r') printf ("%d\n", letter);    
    return 0;
}


