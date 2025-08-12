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
    time_t now = time(0);  
    struct tm *ltm = localtime(&now); 
    char buf[50]; 
  
    strftime(buf, 50, "%Y-%m-%d %H:%M:%S", ltm); 
    puts (buf); 
  
    return 0; 
} 


