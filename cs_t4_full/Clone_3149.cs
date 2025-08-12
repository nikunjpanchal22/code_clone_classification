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


//Implementation 7
public List<string> Keyword_Search(HtmlNode nSearch) {
    return _keywordList.Count == 0 ? new List<string> () :
     (from keyword in _keywordList from Match match in Regex.Matches(nSearch.InnerHtml, $@"\b{keyword}\b") where match.Success select keyword).ToList();
}


