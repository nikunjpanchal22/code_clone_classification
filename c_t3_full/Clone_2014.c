int main () {
    int n;
    char str [100] [100];
    scanf ("%d\n", & n);
    for (int i = 0; i < n; i++) {
        scanf ("%s", str [i]);
    }
    for (int i = 0; i < n; i++)
        printf ("%s\n", str[i]);
    getchar ();
    return 0;
}






#include <string.h>
int main () {
    int n;
    char str [100][100] = {0};
    scanf ("%d", &n);
    for (int i = 0; i < n; i++) gets(str[i]);
    for (int i = 0; i < n; i++) puts(str[i]);
    return 0;
}


