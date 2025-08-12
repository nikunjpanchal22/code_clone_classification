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
int nWords, nFigures; 
strcpy(buff, "In this document, there are 345 words and 6 figures"); 
sscanf (buff, "In this document, there are %d words and %d figures", &nWords, &nFigures); 
cout << "There are " << nWords << " words and " << nFigures << " figures" << endl; 
return 0; 
}


