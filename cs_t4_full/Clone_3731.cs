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
	    List<Func<(string, List<string>)>> content = new List<Func<(string, List<string>)>>();
	    content.Add(() => ("What is Chuck's full name?", new List<string> { "Charles Irving Bartowski", "Charles Richard Bartowski", "Charles Luke Bartowski", "Zachary Strahovski" }));
	    content.Add(() => ("Who/what is Orion?", new List<string> { "Original name of the Intersect", "Alias of a secret mission", "Morgan's Xbox", "Chuck's father" }));

	    var data = content[questionNr - 1].Invoke();

	    questionLabel.Text = data.Item1;
	    ans1.Text = data.Item2[0];
	    ans2.Text = data.Item2[1];
	    ans3.Text = data.Item2[2];
	    ans4.Text = data.Item2[3];
}


