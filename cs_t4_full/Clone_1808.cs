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


 
public void question (int questionNr) {
                switch (questionNr) {
                    case 1 :
                        askQuestion(questionLabel, ans1, ans2, ans3, ans4, questionNr);
                        break;
                    case 2 :
                        askQuestion(questionLabel, ans1, ans2, ans3, ans4, questionNr);
                        break;
                    case 3 :
                        break;
                }
            }

            public void askQuestion(TextView questionLabel, TextView ans1, TextView ans2, TextView ans3, TextView ans4, int questionNr) {
                if (questionNr == 1) {
                    questionLabel.Text = "What is Chuck's full name?";
                    ans1.Text = "Charles Irving Bartowski";
                    ans2.Text = "Charles Richard Bartowski";
                    ans3.Text = "Charles Luke Bartowski";
                    ans4.Text = "Zachary Strahovski";
                } else if (questionNr == 2) {
                    questionLabel.Text = "Who/what is Orion?";
                    ans1.Text = "Original name of the Intersect";
                    ans2.Text = "Alias of a secret mission";
                    ans3.Text = "Morgan's Xbox";
                    ans4.Text = "Chuck's father";
                } 
}


