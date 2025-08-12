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
     if (input < 10) 
      { 
        return "No rating yet"; 
      } 
     else if (input < 20) 
      { 
        return "Low 🔴 🔴 🔴 🔴 🔴"; 
      } 
     else if (input < 40) 
      { 
        return "Medium 🟠 🟠 🟠 🟠 🔴 🔴"; 
      } 
     else if (input < 70) 
      { 
        return "High 🔴 🔴 🔴 🔴 🟠 🔴 🔴"; 
      } 
     else if (input < 120) 
      { 
        return "Very High 🔴 🔴 🔴 🔴 🟠 🔴 🔴 🔴"; 
      } 
     else { 
        return "On Fire 🟠 🟠 🟠 🟠 🟠 🔴 🔴 🔴 🔴"; 
      } 
  }
