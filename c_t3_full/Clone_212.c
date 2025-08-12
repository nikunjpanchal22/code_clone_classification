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



 int main (void) 
{
    char *str = "12 45 16 789 99";
    char *separator;
    int numbers [MAX_NUMBERS];
    int i, count = 0;
 
    while ((separator = strchr(str, ' ')) != NULL)
    {
        *separator = '\0';
        numbers[count] = atoi (str);
        str = separator + 1;
        count++;
    }
    numbers[count] = atoi (str);
    count++;

    for (i = 0; i < count; i++) 
    {
       printf ("%d\n", numbers[i]);
    }
    return 0;
}


