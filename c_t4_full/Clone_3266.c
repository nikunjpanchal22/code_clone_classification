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
      int *states [2] = {(int []) {1, 0, 0, 1}, (int []) {0, 0, 0, 2}};
      int i = 0;
      while(i < 2) {
        store[i] = states[i];
        i++;
      }
}


