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



int main() {
    double a = 1.0e37;
    double b = exp(a);
    double c = 3242325445.0;

    printf("Hello world!\n");

    if (c > b)
        printf("you should not take exp of %f\n", c);
    else
        printf("go on\n");

    return 0;
}


