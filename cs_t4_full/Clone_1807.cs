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
                        setQuestion(questionLabel, ans1, ans2, ans3, ans4, "What is Chuck's full name?", "Charles Irving Bartowski", "Charles Richard Bartowski", "Charles Luke Bartowski", "Zachary Strahovski");
                        break;
                    case 2 :
                        setQuestion(questionLabel, ans1, ans2, ans3, ans4, "Who/what is Orion?", "Original name of the Intersect", "Alias of a secret mission", "Morgan's Xbox", "Chuck's father");
                        break;
                    case 3 :
                        break;
                }
            }

            public void setQuestion(TextView questionLabel, TextView ans1, TextView ans2, TextView ans3, TextView ans4, String question, String a1, String a2, String a3, String a4) {
                questionLabel.Text = question; 
                ans1.Text = a1;
                ans2.Text = a2;
                ans3.Text = a3;
                ans4.Text = a4;
}


