int main (void) {
    char line [128], *p = line;
    int sum = 0, len, n;
    printf ("enter numbers: ");
    scanf ("%127[^\n]", line);
    while (sscanf (p, "%d%n", &n, &len) == 1) {
        sum += n;
        p += len;
    }
    printf ("sum: %d\n", sum);
    return 0;
}


 int main() {
    int sum = 0, i, num;
    char Str[128];
    printf("Enter numbers: ");

    fgets(Str, 128, stdin);
    char* curr = Str;

    while(sscanf(curr, "%d%n", &num, &i) == 1) {
        sum += num;
        curr += i;
    }

    printf("Sum: %d\n", sum);
    return 0;
}


