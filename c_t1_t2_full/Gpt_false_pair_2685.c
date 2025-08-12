int main () {
    time_t timer;
    char buffer [26];
    struct tm *tm_info;
    time (& timer);
    tm_info = localtime (&timer);
    strftime (buffer, 26, "%Y-%m-%d %H:%M:%S", tm_info);
    puts (buffer);
    return 0;
}


int main () { 
    time_t now;
    char buffer[26];
    struct tm *info;
    now = time(0);
    info = localtime(&now);
    strftime(buffer, 26, "%Y-%m-%d %H:%M:%S", info);
    fputs(buffer, stdout);
    return 0;
}
