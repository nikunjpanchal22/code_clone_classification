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




public void question ()
	{
	    string question = questionNr == 1 ? "What is Chuck's full name?" : "Who/what is Orion?";

	    List<string> ansList = questionNr == 1 
	    ? new List<string> { "Charles Irving Bartowski", "Charles Richard Bartowski", "Charles Luke Bartowski", "Zachary Strahovski" } 
	    : new List<string> { "Original name of the Intersect", "Alias of a secret mission", "Morgan's Xbox", "Chuck's father" };

	    questionLabel.Text = question;
	    ans1.Text = ansList[0];
	    ans2.Text = ansList[1];
	    ans3.Text = ansList[2];
	    ans4.Text = ansList[3];
}


