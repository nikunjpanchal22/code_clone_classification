int main (void) {
    char a [100], b [100], c;
    if (scanf ("%99[^\n]%c%99[^\n]", a, &c, b) == 3 && c == '\n') {
        if (strstr (a, b))
            printf ("its a substring\n");
        else
            printf ("not a substring\n");
    }
    return 0;
}


 int main (void) {
    char a [100], b [100], c;
    if (scanf ("%99[^\n]%c%99[^\n]", a, &c, b) == 3 && c == '\n') {
        int indexA = 0;
        int indexB = 0;
        int substring = 0;
        while(a[indexA] != '\0' && b[indexB] != '\0') {
            if(a[indexA] == b[indexB]) {
                indexA++;
                indexB++;
                substring = 1;
            } else {
                indexA = indexA - indexB + 1;
                indexB = 0;
                substring  = 0;
            }
        }
        if (substring == 1) {
            printf ("its a substring\n");
        } else {
            printf ("not a substring\n");
        }
    }
    return 0;
}


