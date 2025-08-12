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



public static string RatingCalculator(int input)
{
    StringBuilder output = new StringBuilder();
    Int32 starFull =  input < 10 ? 0 : input < 20 ? 1 : input < 40 ? 2 : input < 70 ? 3 : input < 120 ? 4 : 5;
    for(int i = 0; i < starFull; ++i)
        output.Append("<img src=\"/images/star.png\" alt=\"*\" />");
    for(int i = starFull; i < 5; ++i)
        output.Append("<img src=\"/images/star_empty.png\" alt=\"-\" />");
    return output.ToString();
}


