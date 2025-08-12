int main (void) {
    const char *str = "Polly";
    const size_t len = strlen (str);
    char buffer [len + 1];
    for (size_t start = 0; start < len; ++start) {
        for (int end = len - 1; end >= (int) start; --end) {
            slice_str (str, buffer, start, end);
            printf ("%s\n", buffer);
        }
    }
    return 0;
}


 
int main (void) {
    const char *str = "Polly";
    size_t len = strlen(str);
    char buffer[len + 1];
    
    for (size_t start = 0; start < len; ++start) {
        for (int end = len; end > (int) start; end--) {
            slice_str (str, buffer, start, end);
            printf ("%s\n", buffer);
        }
    }
    return 0;
}
