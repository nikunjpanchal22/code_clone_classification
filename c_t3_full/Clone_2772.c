int main () {
    clear_icanon ();
    char input_array [5000];
    int len;
    printf ("Enter key: ");
    scanf ("%s", input_array);
    len = strlen (input_array);
    printf ("Message: %s\n", input_array);
    printf ("Message Len: %d\n", len);
    return 0;
}


int main () {
    clear_icanon();
    char buf[BUFSIZ];
    int len;
    printf("Enter: ");
    fgets(buf, sizeof buf, stdin);
    buf[(strlen(buf) - 1)] = '\0';
    len = strlen(buf);
    printf("Desired: %s\n", buf);
    printf("Length: %d\n", len);
    return 0;
}


