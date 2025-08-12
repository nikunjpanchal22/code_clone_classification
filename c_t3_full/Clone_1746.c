int main (void) {
    uint32_t *store [2];
    int i;
    int *states [2];
    states[0] = (int []) {1, 0, 0, 1};
    states[1] = (int []) {0, 0, 0, 2};
    for (i = 0; i < 2; i++) {
        store[i] = states[i];
    }
}



int main (void) {
    uint32_t *store [2];
    int i;
    int states0 [4] = {1, 0, 0, 1};
    int states1 [4] = {0, 0, 0, 2};
    int *states [2];
    states[0] = &states0[0];
    states[1] = &states1[0];
    for (i = 0; i < 2; i++) {
        store[i] = states[i];
    }
}


