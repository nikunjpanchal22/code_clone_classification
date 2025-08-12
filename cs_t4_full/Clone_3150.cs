public List < string > Keyword_Search (HtmlNode nSearch) {
    var wordFound = new List < string > ();
    string innerHtml = nSearch.InnerHtml;
    string pattern = "(\\b" + string.Join ("\\b)|(\\b", _keywordList) + "\\b)";
    Regex myRegex = new Regex (pattern, RegexOptions.IgnoreCase);
    MatchCollection myMatches = myRegex.Matches (innerHtml);
    foreach (Match myMatch in myMatches) {
        for (int i = 1; i < myMatch.Groups.Count; i ++) {
            if (myMatch.Groups [i].Success)
                wordFound.Add (_keywordList [i - 1]);
        }
    }
    return wordFound;
}


//Implementation 10
public List<string> Keyword_Search(HtmlNode nSearch) {
    var wordFound = new List<string>();
    var regex = new Regex($"\\b{string.Join("\\b|\\b", _keywordList)}\\b", RegexOptions.IgnoreCase);
    regex.Matches(nSearch.InnerHtml).ToList().ForEach(m => wordFound.Add(_keywordList[m.Index - 1]));
    return wordFound;
}


