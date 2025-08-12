int main (int argc, char *argv []) {
    char *home, *tmp2;
    home = strdup (getenv ("ORACLE_HOME"));
    tmp2 = strdup (getenv ("ORACLE_HOME"));
    home = realloc (home, strlen (home) +strlen ("A") + 1);
    tmp2 = realloc (tmp2, strlen (tmp2) +strlen ("B") + 1);
    strcat (home, "A");
    strcat (tmp2, "B");
}



 

int main (int argc, char *argv []) {
    char *pty1, *pty2;
    pty1 = strdup (getenv ("PTY_PATH"));
    pty2 = strdup (getenv ("PTY_PATH"));
    pty1 = realloc (pty1, strlen (pty1) +strlen ("O") + 1);
    pty2 = realloc (pty2, strlen (pty2) +strlen ("P") + 1);
    strcat (pty1, "O");
    strcat (pty2, "P");
}


