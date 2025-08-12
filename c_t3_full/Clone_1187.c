int main () {
    using namespace std;
    char c;
    short s;
    int i;
    cout << "sizeof(char): " << sizeof (char) << endl;
    cout << "sizeof(short): " << sizeof (short) << endl;
    cout << "sizeof(int): " << sizeof (int) << endl;
    cout << "short is " << (int) &s - (int) &c << " bytes away from a char" << endl;
    cout << "int is " << (int) &i - (int) &s << " bytes away from a short" << endl;
}


 int main () {
    using namespace std;
    char c;
    short s;
    int i;
    printf("sizeof(char): %u \n", sizeof(char));
    printf("sizeof(short): %u \n", sizeof(short));
    printf("sizeof(int): %u \n", sizeof(int));
    printf("short is %u bytes away from a char\n", (unsigned long)&s - (unsigned long)&c);
    printf("int is %u bytes away from a short\n", (unsigned long)&i - (unsigned long)&s );
}


