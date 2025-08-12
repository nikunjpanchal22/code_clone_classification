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


// 5.
// HashMap<Integer, String[]> questions = new HashMap<>(); 
// questions.put(1, new String[]{"What is Chuck's full name?", "Charles Irving Bartowski", "Charles Richard Bartowski", "Charles Luke Bartowski", "Zachary Strahovski"}); 
// questions.put(2, new String[]{"Who/what is Orion?", "Original name of the Intersect", "Alias of a secret mission", "Morgan's Xbox", "Chuck's father"})

// public void question (int questionNr) {
//     if (questions.containsKey(questionNr)) { 
//         String[] questionDetails = questions.get(questionNr);
//         questionLabel.Text = questionDetails[0];
//         ans1.Text = questionDetails[1];
//         ans2.Text = questionDetails[2];
//         ans3.Text = questionDetails[3];
//         ans4.Text = questionDetails[4]; 
//     }
// }

 public void question (int questionNr) {
                switch (questionNr) {
                    case 1 :
                        askQuestion(1);
                        break;
                    case 2 :
                        askQuestion(2);
                        break;
                    case 3 :
                        break;
                }
            }

            public void askQuestion(int questionNr) {
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


