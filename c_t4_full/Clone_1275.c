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
    int lines, number = 0, divisor, sum = 0, i;
    scanf ("%d %d", &lines, &divisor);
    while (lines--) {
        scanf ("%d", &number);
        if (number % divisor == 0)
            sum++;
    }
    printf ("%d are divisible by %d", sum, divisor);
    return 0;
}


