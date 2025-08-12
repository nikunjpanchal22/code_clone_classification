int main () {
    char str [5] [100];
    for (int i = 0; i < 5; i++) {
        fgets (str [i], 100, stdin);
    }
    for (int j = 0; j < 5; j++) {
        printf ("%s\n", str [j]);
    }
    return 0;
}


  int main () {
    char str [5] [100];
    char *p;
    for (int i = 0; i < 5; i++) {
        if((p=fgets (str [i], 100, stdin)) != NULL);
        {
            char *pos;
             while ((pos = strchr(p, '\n')) != NULL)
            {
                *pos = '\0';
            }
        }
    }
    for (int j = 0; j < 5; j++) {
        printf ("%s\n", str [j]);
    }
    return 0;
}


