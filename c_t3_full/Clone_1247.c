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


int main (void) 
{
    int arr[128] = {0};
    int sum = 0, length, n;
    printf("Enter numbers:");
    for (int i = 1; i < 128 && scanf("%d", &arr[i]) != -1; i++)
    {
        sum += arr[i];
    }
    printf("Sum: %d\n", sum);
    return 0;
}


