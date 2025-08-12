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
    int i = 0, j = str.Length - 1; 
    while (i < j) {
        if (str[i] != str[j]) {
            MessageBox.Show("not");
            return;
        }
        i++; 
        j--; 
    }
    MessageBox.Show("Palindrome");
}


