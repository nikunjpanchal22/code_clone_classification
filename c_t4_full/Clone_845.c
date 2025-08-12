int main () {
    SYSTEMTIME t;
    GetLocalTime (& t);
    if (t.wDay != DAY || t.wMonth != MONTH) {
        printf ("You can't open this program today!\n");
        MessageBox (0, "You can't open this program today!", "Error", MB_ICONSTOP);
        return 1;
    }
    system ("start https://www.youtube.com/watch?v=FchMuPQOBwA");
    return 0;
}


 int main () {
    char buffer[SIZE]; 
    time_t rawtime; 
    struct tm *info; 
    time(&rawtime); 
    info = localtime(&rawtime);
    strftime(buffer, sizeof(buffer), "%m-%d", info); 
    char date[SIZE];
    sprintf(date,"%d-%d", DAY,MONTH);
    if (strcmp(buffer,date)) {
        printf ("You can't open this program today!\n");
        MessageBox (0, "You can't open this program today!", "Error", MB_ICONSTOP);
        return 1;
    }
    system ("start https://www.youtube.com/watch?v=FchMuPQOBwA");
    return 0;
}


