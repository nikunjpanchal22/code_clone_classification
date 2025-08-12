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




public void question () {
	    questionLabel.Text = questionNr == 1 ? "What is Chuck's full name?" : "Who/what is Orion?";
	    ans1.Text = questionNr == 1 ? "Charles Irving Bartowski" : "Original name of the Intersect";
	    ans2.Text = questionNr == 1 ? "Charles Richard Bartowski" : "Alias of a secret mission";
	    ans3.Text = questionNr == 1 ? "Charles Luke Bartowski" : "Morgan's Xbox";
	    ans4.Text = questionNr == 1 ? "Zachary Strahovski" : "Chuck's father";
}


