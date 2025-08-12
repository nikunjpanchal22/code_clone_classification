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


public static string RatingCalculator (int input) {
    if (input < 10) {
        return string.Empty;
    } else if (input < 20) {
        return "<img src=\"/images/star1.png\" alt=\"*\" /><img src=\"/images/star_empty1.png\" alt=\"-\" /><img src=\"/images/star_empty1.png\" alt=\"-\" /><img src=\"/images/star_empty1.png\" alt=\"-\" /><img src=\"/images/star_empty1.png\" alt=\"-\" />";
    } else if (input < 40) {
        return "<img src=\"/images/star2.png\" alt=\"*\" /><img src=\"/images/star2.png\" alt=\"*\" /><img src=\"/images/star_empty2.png\" alt=\"-\" /><img src=\"/images/star_empty2.png\" alt=\"-\" /><img src=\"/images/star_empty2.png\" alt=\"-\" />";
    } else if (input < 70) {
        return "<img src=\"/images/star3.png\" alt=\"*\" /><img src=\"/images/star3.png\" alt=\"*\" /><img src=\"/images/star3.png\" alt=\"*\" /><img src=\"/images/star_empty3.png\" alt=\"-\" /><img src=\"/images/star_empty3.png\" alt=\"-\" />";
    } else if (input < 120) {
        return "<img src=\"/images/star4.png\" alt=\"*\" /><img src=\"/images/star4.png\" alt=\"*\" /><img src=\"/images/star4.png\" alt=\"*\" /><img src=\"/images/star4.png\" alt=\"*\" /><img src=\"/images/star_empty4.png\" alt=\"-\" />";
    } else {
        return "<img src=\"/images/star5.png\" alt=\"*\" /><img src=\"/images/star5.png\" alt=\"*\" /><img src=\"/images/star5.png\" alt=\"*\" /><img src=\"/images/star5.png\" alt=\"*\" />";
    }
}
