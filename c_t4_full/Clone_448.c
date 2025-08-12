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
    int i;
    for (i = 0; i < strlen (ch) / 2; i++) {
        ch [i] ^= ch [strlen (ch) - i - 1];
        ch[strlen (ch) - i - 1] ^= ch[i];
        ch [i] ^= ch [strlen (ch) - i - 1];
    }
    printf ("Reversed String: %s\n", ch);
    return 0;
}


