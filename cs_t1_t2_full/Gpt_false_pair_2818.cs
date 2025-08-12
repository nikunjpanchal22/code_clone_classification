private void btnCheck_Click (object sender, EventArgs e) {
    int userGuess = int.Parse (txtGuess.Text);
    guessCount ++;
    if (userGuess == target) {
        this.BackColor = System.Drawing.Color.DarkOliveGreen;
        lblHowMuch.Text = String.Format ("You guessed the right number it took you {0} guesses", guessCount);
    } else {
        this.BackColor = userGuess < target ? System.Drawing.Color.Yellow : System.Drawing.Color.Red;
    }
    lblCount.Text = String.Format ("You made {0} Guesses", guessCount);
}


private void btnCheck_Click (object sender, EventArgs e) {
    int userGuess = Convert.ToInt32 (txtGuess.Text);
    guessCount ++;
    if (userGuess == target) {
        this.BackColor = System.Drawing.Color.DarkOliveGreen;
        lblHowMuch.Text = String.Format ("You guessed the right number and it took you {0} guesses", guessCount);
    } else {
        this.BackColor = userGuess < target ? System.Drawing.Color.Orange : System.Drawing.Color.Indigo;
    }
    lblCount.Text = String.Format ("You have made {0} Guesses", guessCount);
}
