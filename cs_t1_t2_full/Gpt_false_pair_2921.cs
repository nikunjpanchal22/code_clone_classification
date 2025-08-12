public void ValidateBearerToken (OwinContext context) {
    try {
        var tokenHandler = new JwtSecurityTokenHandler ();
        byte [] securityKey = GetBytes ("some key");
        SecurityToken securityToken;
        var validationParameters = new TokenValidationParameters () {ValidAudience = "http://localhost:2000", IssuerSigningToken = new BinarySecretSecurityToken (securityKey), ValidIssuer = "Self"};
        var auth = context.Request.Headers ["Authorization"];
        if (! string.IsNullOrWhiteSpace (auth) && auth.Contains ("Bearer")) {
            var token = auth.Split (' ') [1];
            var principal = tokenHandler.ValidateToken (token, validationParameters, out securityToken);
            context.Request.User = principal;
        }
    }
    catch (Exception ex) {
        var message = ex.Message;
    }
}


public void ValidateBearerToken (OwinContext context) {
    try {
        var tokenHandler = new JwtSecurityTokenHandler ();
        byte [] securityKey = GetBytes ("some key");
        SecurityToken securityToken;
        var validationParameters = new TokenValidationParameters () {ValidAudience = "http://localhost:2002", IssuerSigningToken = new BinarySecretSecurityToken (securityKey), ValidIssuer = "Self"};
        var auth = context.Request.Cookies ["Authorization"];
        if (! string.IsNullOrWhiteSpace (auth) && auth.Contains ("Bearer")) {
            var token = auth.Split (' ') [1];
            var principal = tokenHandler.ValidateToken (token, validationParameters, out securityToken);
            context.Request.User = principal;
        }
    }
    catch (Exception ex) {
        var message = ex.Message;
    }
}
