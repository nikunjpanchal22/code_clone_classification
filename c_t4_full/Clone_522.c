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
    char tmpstr[1000];
    int i = 0;
    
    for (i=0; i<1000; i++) {
        if (-1 == getline(tmpstr)) break;
        s[i] = strdup(tmpstr);
    }

    return 0;
}


