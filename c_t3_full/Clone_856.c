int main (int ac, char **av) {
    char *str;
    int i;
    i = 0;
    str = strdup ("Hello World");
    while (str[i]) {
        if (i == 6)
            str[i] = '\0';
        i++;
    }
    printf ("%s\n", str);
}


 int main (int ac, char **av) {
    char *str;
    int i;
    i = 0;
    str = strdup ("Hello World");
    while (*str) {
        if (i == 6) {
            *str = '\0';
            break;
        }
        str++;
        i++;
    }
    printf ("%s\n", str-6);
}


