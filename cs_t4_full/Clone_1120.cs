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
    Boolean palindrome = true;
    int i = 0;
    int len = str.Length - 1;

    while (i < len && palindrome) {
        if (str[i] != str[len]) {
            palindrome = false;
        }
        i++;
        len--;
    }
 
    if (palindrome) {
        MessageBox.Show("Palindrome");
    } else {
        MessageBox.Show("not");
    }
}


