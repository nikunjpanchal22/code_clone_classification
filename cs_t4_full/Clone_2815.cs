public static string RatingCalculator (int input) {
    if (input < 10) {
        return string.Empty;
    } else if (input < 20) {
        return "<img src=\"/images/star.png\" alt=\"*\" /><img src=\"/images/star_empty.png\" alt=\"-\" /><img src=\"/images/star_empty.png\" alt=\"-\" /><img src=\"/images/star_empty.png\" alt=\"-\" /><img src=\"/images/star_empty.png\" alt=\"-\" />";
    } else if (input < 40) {
        return "<img src=\"/images/star.png\" alt=\"*\" /><img src=\"/images/star.png\" alt=\"*\" /><img src=\"/images/star_empty.png\" alt=\"-\" /><img src=\"/images/star_empty.png\" alt=\"-\" /><img src=\"/images/star_empty.png\" alt=\"-\" />";
    } else if (input < 70) {
        return "<img src=\"/images/star.png\" alt=\"*\" /><img src=\"/images/star.png\" alt=\"*\" /><img src=\"/images/star.png\" alt=\"*\" /><img src=\"/images/star_empty.png\" alt=\"-\" /><img src=\"/images/star_empty.png\" alt=\"-\" />";
    } else if (input < 120) {
        return "<img src=\"/images/star.png\" alt=\"*\" /><img src=\"/images/star.png\" alt=\"*\" /><img src=\"/images/star.png\" alt=\"*\" /><img src=\"/images/star.png\" alt=\"*\" /><img src=\"/images/star_empty.png\" alt=\"-\" />";
    } else {
        return "<img src=\"/images/star.png\" alt=\"*\" /><img src=\"/images/star.png\" alt=\"*\" /><img src=\"/images/star.png\" alt=\"*\" /><img src=\"/images/star.png\" alt=\"*\" />";
    }
}



public static string RatingCalculator (int input)
{
    input = input / 20;
    string result = "";

    for(int i=0; i < 5; i++)
    {
        if(i < input)
            result += "<img src=\"/images/star.png\" alt=\"*\" />";
        else 
            result += "<img src=\"/images/star_empty.png\" alt=\"-\" />";
    }
	
    return result;
}


