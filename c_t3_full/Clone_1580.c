int main () {
    char *buff = "In this document, there are 345 words and 6 figures";
    char extra1 [5000];
    char extra2 [5000];
    int a, b;
    sscanf (buff, "%[In this document, there are ]%d%[ words and ]%d", extra1, & a, extra2, & b);
    cout << a << " " << b << endl;
    return 0;
}


 int main() 
{ 
char buff[50]; 
int count_words, count_figures; 
strcpy(buff, "In this document, there are 345 words and 6 figures"); 
sscanf(buff, "In this document, there are %d words and %d figures", &count_words, &count_figures); 
cout << "Number of words is: " << count_words << " and number of figures is: " << count_figures << endl; 
return 0; 
}


