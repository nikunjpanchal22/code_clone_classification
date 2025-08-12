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
    int length = str.Length;
    bool palindrome = true;
    for (int i = 0; i < length; i++) {
        if (str[i] != str[length -1 - i]) {
            palindrome = false;
            break;
        }
    }
    if (palindrome) {
        MessageBox.Show("Palindrome");
    }
    else {
        MessageBox.Show("not");
    }
}


