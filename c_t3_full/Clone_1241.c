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


 int main(void)
{
    int length, sum= 0, num;
    char line[128];
    printf("Enter numbers: ");
    fgets(line, sizeof line, stdin);
    char* n = line;
    while (sscanf(n,"%d%n",&num,&length)==1)
    {
        sum += num;
        n += length;
    }
    printf("Sum: %d\n", sum);
    return 0;

}


