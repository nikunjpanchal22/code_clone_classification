int main (void) {
    float a, b, c;
    double d;
    printf ("Enter the values of 'a','b' and 'c': ");
    if (scanf ("%f %f %f", &a, &b, &c) == 3) {
        d = my_function (a, b, c);
        printf ("Result: %f\n", d);
    }
    else
        printf ("Oops: I didn't understand what you typed\n");
}




double my_function (float x, float y, float z) {
    return pow(x,y)*z;
}


