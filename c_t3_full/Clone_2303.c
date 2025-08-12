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
    char *log1, *log2;
    log1 = strdup (getenv ("LOG_PATH"));
    log2 = strdup (getenv ("LOG_PATH"));
    log1 = realloc (log1, strlen (log1) +strlen ("G") + 1);
    log2 = realloc (log2, strlen (log2) +strlen ("H") + 1);
    strcat (log1, "G");
    strcat (log2, "H");
}


