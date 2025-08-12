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
    float a = 1E+37;
    float b = logf(a);
    float c = 3242325445.0f;
    printf("Hello there!");
    if (c > b) {
        printf("don't take log of %.2f\n", c);
    } else {
        printf("keep going!\n");
    }
    return 0;
}


