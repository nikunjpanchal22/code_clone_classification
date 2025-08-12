int main (void) {
    char *str = "12 45 16 789 99";
    char *end = str;
    int numbers [MAX_NUMBERS];
    int i, count = 0;
    for (i = 0; i < MAX_NUMBERS; i++) {
        numbers[i] = (int) strtol (end, &end, 10);
        count++;
        if (*end == '\0')
            break;
    }
    for (i = 0; i < count; i++) {
        printf ("%d\n", numbers [i]);
    }
    return 0;
}


  int main(void)
{
    char *str = "12 45 16 789 99";
    char *separator;
    char *end;
    int numbers[MAX_NUMBERS];
    int i, count = 0;

    end = str;

    while ((separator = strchr(end, ' ')) != NULL)
    {
        *separator = '\0';
        numbers[count] = (int)strtol(end, NULL, 10);
        count++;
        end = separator + 1;
    }
    numbers[count] = (int)strtol(end, NULL, 10);
    count++;

    for (i = 0; i < count; i++)
    {
        printf("%d\n", numbers[i]);
    }

    return 0;
}


