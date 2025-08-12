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
    char **s = (char**) malloc (1000 * sizeof (char*));
    char tmp [1000];
    int i;
    while (fgets(tmp, sizeof tmp, stdin) != NULL){
        s[i++] = strdup(tmp);
    }
    return 0;
}
