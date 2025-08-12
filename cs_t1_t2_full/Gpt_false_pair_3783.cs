private string privateFormatException (Exception e) {
    var exError = String.Empty;
    if (e == null) {
        return exError;
    }
    exError += "<fieldset><legend><a href='#'>" + "<span class='show-expanded'>collapse message</span>" + "<span class='show-collapsed'>expand message</span>" + "</a></legend><p>" + e.Message + "</p></fieldset>";
    exError += "<fieldset><legend><a href='#'>" + "<span class='show-expanded'>collapse trace</span>" + "<span class='show-collapsed'>expand trace</span>" + "</a></legend><p>" + e.StackTrace + "</p></fieldset>";

#====================
#gpt output=============
    return exError ;
}


private string privateFormatException (Exception e) {
    var exError = String.Empty;
    if (e == null) {
        return exError;
    }
    exError += "<fieldset><legend><a href='#'>" + "<span class='show-expanded'>close message</span>" + "<span class='show-collapsed'>see message</span>" + "</a></legend><p>" + e.Message + "</p></fieldset>";
    exError += "<fieldset><legend><a href='#'>" + "<span class='show-expanded'>hide trace</span>" + "<span class='show-collapsed'>see trace</span>" + "</a></legend><p>" + e.StackTrace + "</p></fieldset>";
    return exError ;
}
