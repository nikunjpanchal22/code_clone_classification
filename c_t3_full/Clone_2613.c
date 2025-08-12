int main () {
    int n;
    scanf ("%d ", & n);
    char a [100] [10];
    for (int i = 0; i < n; i++) {
        fgets (a [i], 10, stdin);
    }
    return 0;
}



#include <stdio.h>
int main() {
    int n, i = 0;
    scanf ("%d", &n);
    char a [100] [10];
    while(i < n) {
        gets(a[i]);
        i++;
    }
    return 0;
}


