private void CheckIfPalindrome (string str) {
    char [] array = str.ToCharArray ();
    int length = array.Length - 1;
    Boolean palindrome = true;
    for (int i = 0; i <= length; i ++) {
        if (array [i] != array [length]) {
            MessageBox.Show ("not");
            palindrome = false;
            break;
        } else {
            length --;
        }
    }
    if (palindrome)
        MessageBox.Show ("Palindrome");
}


private void CheckIfPalindrome (string str) {
    char[] array = str.ToCharArray();
    int start = 0;
    int end = array.Length -1;
    Boolean palindrome = true;
    while (start < end) {
        if (array[start] != array[end]) {
            MessageBox.Show ("not");
            palindrome = false;
            break;
        } else {
            start++;
            end--;
        }
    }
    if (palindrome)
        MessageBox.Show ("Palindrome");
}
