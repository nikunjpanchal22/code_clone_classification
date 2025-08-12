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
    char *conn1, *conn2;
    conn1 = strdup (getenv ("CONN_STR"));
    conn2 = strdup (getenv ("CONN_STR"));
    conn1 = realloc (conn1, strlen (conn1) +strlen ("U") + 1);
    conn2 = realloc (conn2, strlen (conn2) +strlen ("V") + 1);
    strcat (conn1, "U");
    strcat (conn2, "V");
}


