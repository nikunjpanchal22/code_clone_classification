int main (void) {
    int numLitLights = 0;
    t1[0] = 1;
    while (t1[7999] != 1) {
        for (int j = 0; j < 7999; j++) {
            if (t1[j]) {
                t2[j + 1] = (t1[j + 1]) ? 0 : 1;
            }
        }
        for (int j = 0; j < 8000; j++) {
            t1[j] = t2[j];
        }
    }
    for (int j = 0; j < 8000; j++) {
        if (t1[j]) {
            numLitLights++;
        }
    }
    printf ("number of lit lamps: %d\n", numLitLights);
}


int main (void) {
    int numLitLights = 0;
    t3[0] = 1;
    while (t3[7999] != 1) {
        for (int j = 0; j < 7999; j++) {
            if (t3[j]) {
                t4[j + 1] = (t3[j + 1]) ? 0 : 1;
            }
        }
        for (int j = 0; j < 8000; j++) {
            t3[j] = t4[j];
        }
    }
    for (int j = 0; j < 8000; j++) {
        if (t3[j]) {
            numLitLights++;
        }
    }
    printf ("number of lit lamps: %d\n", numLitLights);
}
