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
    time_t current_time; 
    char buf[50]; 
  
    current_time = time(NULL); 
    strftime(buf, 50, "%Y-%m-%d %H:%M:%S", localtime(&current_time));
    puts (buf); 
  
    return 0; 
} 


