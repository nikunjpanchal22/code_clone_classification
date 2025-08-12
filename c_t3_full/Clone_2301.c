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
    char *db1, *db2;
    db1 = strdup (getenv ("DB_NAME"));
    db2 = strdup (getenv ("DB_NAME"));
    db1 = realloc (db1, strlen (db1) +strlen ("Q") + 1);
    db2 = realloc (db2, strlen (db2) +strlen ("R") + 1);
    strcat (db1, "Q");
    strcat (db2, "R");
}


