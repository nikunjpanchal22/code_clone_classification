int main () {
    char ch [100];
    scanf ("%s", & ch);
    int i = 0;
    while (i < strlen (ch) / 2) {
        ch[i] = ch[i] ^ ch[strlen (ch) - i - 1];
        ch[strlen (ch) - i - 1] = ch[i] ^ ch[strlen (ch) - i - 1];
        ch[i] = ch[i] ^ ch[strlen (ch) - i - 1];
        i++;
    }
    printf ("Reversed String: %s\n", ch);
    return 0;
}


 int main () {
    char ch [100];
    scanf ("%s", & ch);
    int i, j;
    j = strlen (ch) - 1;
    for (i = 0; i <= j; i++, j--) {
        ch [i] ^= ch [j];
        ch [j] ^= ch [i];
        ch [i] ^= ch [j];
    }
    printf ("Reversed String: %s\n", ch);
    return 0;
}


