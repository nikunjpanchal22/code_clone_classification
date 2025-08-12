bool isPrime (int number) {
    if (number < 2) return false;
    if (number == 2) return true;
    if (number % 2 == 0) return false;
    for (int i = 3;
    (i * i) <= number; i += 2) {
        if (number % i == 0) return false;
    }
    return true;
}


bool isPrime (int number) {
    if (number < 2) return false; // Line 1
    if (number == 2) return true;  // Line 2
    if (number % 2 == 0) return false; // Line 3
    for (int i = 3; (i * i) <= number; i += 2) { // Line 4
        if (number % i == 0) return false; // Line 5
    }
    return true; // Line 6
}
