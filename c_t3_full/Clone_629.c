int main () {
    int i, j;
    char str [1000];
    scanf ("%s", str);
    for (i = 0; str[i] != '\0'; i++) {
        for (j = i + 1; str[j] != '\0'; j++) {
            if (str[i] == str[j]) {
                printf ("%c", str [i]);
                return 0;
            }
        }
    }
}


 
int main() {
    int i, j;
    char str[1000];
    bool repeat;
    scanf("%s", str);
    for (i = 0; str[i] != '\0'; i++)
    {
        repeat = false;
        for (j = 0; str[j] != '\0'; j++)
        {
            if (i != j && str[i] == str[j]) {
                repeat = true;
                break;
            }
        }

        if (repeat)
        {
            printf("%c", str[i]);
            return 0;
        }
    }
}


