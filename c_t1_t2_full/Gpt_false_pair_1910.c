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
    printf ("Enter the keyphrase: ");
    scanf (" %5s", ckey);
    if (strcmp (ckey, key) == 0) {
        printf ("Success!\n");
    }
    else {
        printf ("Failed.\n");
    }
    return 0;
}
