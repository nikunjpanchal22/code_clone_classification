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


 int main() {
    char c;
    short s;
    int i;

    printf("sizeof(char): %zd\n", sizeof(char));
    printf("sizeof(short): %zd\n", sizeof(short));
    printf("sizeof(int): %zd\n", sizeof(int));

    int charDistance = &s - &c;
    int intDistance = &i - &s;

    printf("short is %d bytes away from a char\n", charDistance);
    printf("int is %d bytes away from a short\n", intDistance);
}


