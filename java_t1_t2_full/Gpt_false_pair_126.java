public int maxBlock (String str) {
    int max = 0;
    int count = 1;
    char o = ' ';
    for (int i = 0;
    i < str.length (); i ++) {
        char c = str.charAt (i);
        if (c == o) {
            count ++;
            if (count > max) {
                max = count;
            }
        } else {
            count = 1;
            if (count > max) {
                max = count;
            }
        }
        o = c;
    }
    return max;
}


 public int maxBlock (String str) {
int greatestLength = 0;
    int sequenceLength = 0; 
    char predecessor = ' '; 
    for (int a = 0; a < str.length(); a++) {
        char current = str.charAt(a); 
        if (predecessor == current) { 
            sequenceLength++; 
            if (sequenceLength > greatestLength) {
                greatestLength = sequenceLength; 
            }
        } else { 
            sequenceLength = 0;
            if (sequenceLength > greatestLength) {
                greatestLength = sequenceLength; 
            }
        }
        predecessor = current; 
    } 
    return greatestLength;
}
