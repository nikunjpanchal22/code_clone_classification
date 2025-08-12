public void question () {
    switch (questionNr) {
        case 1 :
            questionLabel.Text = "What is Chuck's full name?";
            ans1.Text = "Charles Irving Bartowski";
            ans2.Text = "Charles Richard Bartowski";
            ans3.Text = "Charles Luke Bartowski";
            ans4.Text = "Zachary Strahovski";
            break;
        case 2 :
            questionLabel.Text = "Who/what is Orion?";
            ans1.Text = "Original name of the Intersect";
            ans2.Text = "Alias of a secret mission";
            ans3.Text = "Morgan's Xbox";
            ans4.Text = "Chuck's father";
            break;
        case 3 :
            break;
    }
}


 
public void displayQuestion(int questionNr) {
                // Initialize class variables
                switch (questionNr) {
                    case 1 :
                        setupQuestion("What is Chuck's full name?", "Charles Irving Bartowski", "Charles Richard Bartowski", "Charles Luke Bartowski", "Zachary Strahovski");
                        break;
                    case 2 :
                        setupQuestion("Who/what is Orion?", "Original name of the Intersect", "Alias of a secret mission", "Morgan's Xbox", "Chuck's father");
                        break;
                    case 3 :
                        break;
                }
            }

            public void setupQuestion(String questionLabel, String a1, String a2, String a3, String a4) {
                this.questionLabel.Text = questionLabel; 
                ans1.Text = a1;
                ans2.Text = a2;
                ans3.Text = a3;
                ans4.Text = a4;
}


