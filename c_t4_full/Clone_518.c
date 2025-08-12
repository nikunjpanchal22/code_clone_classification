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
    char** s = (char**) malloc(1000 * sizeof(char*));
    char tmp[1000];
    int i = 0;
    
    while ((tmp[i] = getchar()) != EOF) {
        if (tmp[i] == '\n') {
            tmp[i] = '\0';
            s[i] = (char*)malloc(strlen(tmp) + 1);
            strcpy(s[i], tmp);
            i = 0;
        }
        else {
            i++;
        }
    }
    return 0;
}


