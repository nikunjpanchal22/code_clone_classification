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
    int left = 0;
    int right = str.Length - 1;

    while (left < right) {
        if (str[left] != str[right]) {
            MessageBox.Show("not");
            return;
        }
        left ++;
        right --;
    }
 
    MessageBox.Show("Palindrome");
}


