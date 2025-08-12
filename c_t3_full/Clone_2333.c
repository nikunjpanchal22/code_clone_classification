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
int main() {
    float a = pow(10.0f, 37.0f);
    float b = log(a);
    float c = 3242325445.0f;
    printf("Salutations!\n");
    if (c > b) {
        printf("oops %.2f\n", c);
    } else {
        printf("go ahead!\n");
    }
    return 0;
}

