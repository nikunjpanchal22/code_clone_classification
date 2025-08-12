int main () {
    char **s = (char **) malloc (1000 * sizeof (char *));
    char tmpstr [1000];
    int i;
    while (-1 != getline (tmpstr)) {
        s[i++] = strdup (tmpstr);
    }
    return 0;
}


int main () {
    char **s = malloc(MAX_SIZE * sizeof(char *));
    char str[MAX_SIZE];
    int i = 0;
    while (read_line(str)) {
        s[i++] = strdup(str);
    }
    return 0;
}


