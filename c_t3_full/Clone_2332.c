int main () {
    float a = 1E+37f;
    float b = log (a);
    float c = 3242325445.0f;
    cout << "Hello world!" << endl;
    if (c > b) {
        cout << "you should not take exp of " << c << endl;
    }
    else {
        cout << "go on" << endl;
    }
    return 0;
}




#include<cstdio>
#include<cmath>
int main () {
    float a = 1e37;
    float b = log10(a);
    float c = 3242325445.0f;
    printf("Hello world!\n");
    if (c > b) {
        printf("%.2f is not valid!\n", c);
    } else {
        printf("please continue!\n");
    }
    return 0;
}


