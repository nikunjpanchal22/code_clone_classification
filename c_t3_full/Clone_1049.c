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
    int i = 0;
    int len = strlen (ch);
    for (i = 0; i < len/2; i++) {
        char temp = ch[i];
        ch[i] = ch[len-i-1];
        ch[len-i-1] = temp;
    }
    printf ("Reversed String: %s\n", ch);
    return 0;
}


