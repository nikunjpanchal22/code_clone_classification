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




public void question()
{
		    if (questionNr == 1)
		    {
			setQuestionText("What is Chuck's full name?", "Charles Irving Bartowski", "Charles Richard Bartowski", "Charles Luke Bartowski", "Zachary Strahovski");
		    }
		    else if (questionNr == 2)
		    {
			setQuestionText("Who/what is Orion?", "Original name of the Intersect", "Alias of a secret mission", "Morgan's Xbox", "Chuck's father");
		    }
		}

		public void setQuestionText(string question, string answer1, string answer2, string answer3, string answer4)
		{
		    questionLabel.Text = question;
		    ans1.Text = answer1;
		    ans2.Text = answer2;
		    ans3.Text = answer3;
		    ans4.Text = answer4;
}


