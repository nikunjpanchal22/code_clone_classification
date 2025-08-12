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




public void question() {
	    List<string> questionList = new List<string> { "What is Chuck's full name?", "Who/what is Orion?" };
	    List<string> ans1List = new List<string> { "Charles Irving Bartowski", "Original name of the Intersect" };
	    List<string> ans2List = new List<string> { "Charles Richard Bartowski", "Alias of a secret mission" };
	    List<string> ans3List = new List<string> { "Charles Luke Bartowski", "Morgan's Xbox" };
	    List<string> ans4List = new List<string> { "Zachary Strahovski", "Chuck's father" };

	    questionLabel.Text = questionList[questionNr - 1];
	    ans1.Text = ans1List[questionNr - 1];
	    ans2.Text = ans2List[questionNr - 1];
	    ans3.Text = ans3List[questionNr - 1];
	    ans4.Text = ans4List[questionNr - 1];
}


