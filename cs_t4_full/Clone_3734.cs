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
	    Dictionary<int, Tuple<string, List<string>>> data = new Dictionary<int, Tuple<string, List<string>>>
	    {
		{
		    1,
		    new Tuple<string, List<string>>(
		        "What is Chuck's full name?",
		        new List<string>{
		            "Charles Irving Bartowski",
		            "Charles Richard Bartowski",
		            "Charles Luke Bartowski",
		            "Zachary Strahovski"
		        }
		    )
		},
		{
		    2,
		    new Tuple<string, List<string>>(
		        "Who/what is Orion?",
		        new List<string>{
		            "Original name of the Intersect",
		            "Alias of a secret mission",
		            "Morgan's Xbox",
		            "Chuck's father"
		        }
		    )
		}
	    };

	    questionLabel.Text = data[questionNr].Item1;
	    ans1.Text = data[questionNr].Item2[0];
	    ans2.Text = data[questionNr].Item2[1];
	    ans3.Text = data[questionNr].Item2[2];
	    ans4.Text = data[questionNr].Item2[3];
}


