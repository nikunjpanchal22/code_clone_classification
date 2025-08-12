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
    str = strdup ("Hello World");
    i = 0;
    while (str[i] != '\0') {
        if (i == 6)
            break;
        i++;
    }
    str[i] = 0;
    printf ("%s\n", str);
}


