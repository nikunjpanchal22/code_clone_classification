int main () {
    char key [] = "april", ckey [6];
    printf ("Enter the key: ");
    scanf (" %5s", ckey);
    if (!strcmp (ckey, key)) {
        printf ("Correct.");
    }
    else {
        printf ("Wrong.");
    }
    return 0;
}


 int main () {
    char key [] = "april", ckey [6];
    printf ("Enter the key: ");
    scanf (" %s", ckey);
    int result = strcmp(ckey, key);
    if (result == 0) {
        printf ("Correct!");
    }
    else {
        printf ("Incorrect!");
    }
    return 0;
}
