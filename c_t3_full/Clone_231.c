int main () {
    int lines, number = 0, dividend, ans = 0, i, chars_read;
    char buf [BUFSIZE + 1] = {0};
    scanf ("%d%d\n", & lines, & dividend);
    while ((chars_read = fread (buf, 1, BUFSIZE, stdin)) > 0) {
        for (i = 0; i < chars_read; i++) {
            if (buf[i] != '\n')
                number = buf[i] - '0' + 10 * number;
            else {
                if (number % dividend == 0)
                    ans += 1;
                lines -= 1;
                number = 0;
            }
        }
        if (lines == 0)
            break;
    }
    printf ("%d are divisible by %d \n", ans, dividend);
    return 0;
}


 int main () {
    int lines, number = 0, dividend, ans = 0;
    char buf[BUFSIZ] = {0};
    scanf ("%d%d\n", & lines, & dividend);
    while (lines > 0 && fgets(buf, BUFSIZ, stdin)) {
        for (int i = 0; i < strlen(buf); i++) {
            if (buf[i] != '\n')
                number = buf[i] - '0' + 10 * number;
            else {
                if (number % dividend == 0)
                    ans += 1;
                lines -= 1;
                number = 0;
            }
        }
    }
    printf ("%d are divisible by %d \n", ans, dividend);
    return 0;
}


