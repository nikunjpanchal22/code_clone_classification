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
            try 
        { 
            string auth = context.Request.Headers["Authorization"];   
            if (!string.IsNullOrWhiteSpace(auth) && auth.Contains("Bearer")) 
            { 
                string token = auth.Split(' ')[1]; 
                var handler = new JwtSecurityTokenHandler(); 
                
                var securityKeyBytes = GetBytes("some key"); 
                var securityToken = new BinarySecretSecurityToken(securityKeyBytes); 
            
                var validationParameters = new TokenValidationParameters 
                { 
                    ValidAudience = "http://localhost:2000", 
                    IssuerSigningToken = securityToken, 
                    ValidIssuer = "Self" 
                }; 
                
                var principal = handler.ValidateToken(token, validationParameters, out securityToken); 
                context.Request.User = principal; 
            } 
        } catch (Exception ex) 
        { 
        var message = ex.Message; 
        }
}


