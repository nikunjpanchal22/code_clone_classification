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
    scanf (" %5s", ckey);
    if (strlen(ckey) == 5 && strcmp (ckey, key) == 0) {
        printf ("Key accepted!\n");
    }
    else {
        printf ("Invalid key!\n");
    }
    return 0;
}
