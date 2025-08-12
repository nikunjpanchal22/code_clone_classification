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


 int main () 
{ 
    time_t now; 
    struct tm *tme;
    char buffer[50]; 
    now = time(NULL); 
    tme = localtime(&now);
    strftime(buffer, 50, "%Y-%b-%d %I:%M:%S", tme); 
    puts (buffer); 
  
    return 0; 
}
