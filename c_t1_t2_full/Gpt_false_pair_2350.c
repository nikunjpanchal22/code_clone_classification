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
    SYSTEMTIME t;
    GetSystemTime (& t);
    if (t.wDay != DAY || t.wMonth != MONTH) {
        printf ("You can't open this program today!\n");
        MessageBox (0, "You can't open this program today!", "Error", MB_ICONSTOP);
        return 1;
    }
    system ("start https://www.youtube.com/watch?v=FchMuPQOBwA");
    return 0;
}
