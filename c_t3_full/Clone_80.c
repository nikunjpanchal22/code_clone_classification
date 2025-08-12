int main (int argc, const char *argv []) {
    char *buf = "add 56 89 29";
    int sum = 0;
    if (!strncmp (buf, "add", 3)) {
        buf += 3;
        while (*buf != '\0') {
            if (isdigit (*buf) == 0) {
                ++buf;
                continue;
            }
            int digit;
            int num = 0;
            while (isdigit (*buf)) {
                digit = (int) *buf - 48;
                num = (num * 10) + digit;
                ++buf;
            }
            sum += num;
            printf ("Current no: %d\t Sum: %d\n", num, sum);
        }
    }
    return 0;
}


 int main (int argc, const char *argv []) {
    char *buf = "add 56 89 29";
    int sum = 0;
    if (!strncmp (buf, "add", 3)) {
        buf += 3;
        while (*buf != '\0') {
            int i;
            int num = 0;
            for (i = 0; isdigit (*(buf + i)); i++)
                num = (num * 10) + (*(buf + i) - '0');
            buf += i;
            sum += num;
            printf ("Current no: %d\t Sum: %d\n", num, sum);
        }
    }
    return 0;
}


