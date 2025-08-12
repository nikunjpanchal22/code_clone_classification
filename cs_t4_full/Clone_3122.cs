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
    str = str.ToLower();
    string rev = string.Empty;
    for (int i = str.Length - 1; i >= 0; i--) {
        rev += str[i].ToString();
    }
    bool equals = str.Equals(rev);
    MessageBox.Show(equals ? "Palindrome" : "not");
}


