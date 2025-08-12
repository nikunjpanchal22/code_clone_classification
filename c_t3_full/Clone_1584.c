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
char *buf = "In this document, there are 345 words and 6 figures"; 
int words, figures; 
sscanf(buf, "%*[In this document,]%*[ there are ]%d%*[ words and ]%d", &words, &figures); 
cout<<words<<" "<<figures<<endl; 
return 0; 
}


