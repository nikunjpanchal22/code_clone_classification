public ApiResponse < IEnumerable < Customers > > getCustomersById (string id) {
    var retVal = new ApiResponse < IEnumerable < Customers > > ();
    var isAuthenticated = tokenAuthorization.validateToken (access_token);
    if (! isAuthenticated) {
        retVal.Message = "You are not authrized";
        return retVal;
    }
    try {
        var data = yourList;
        retVal.IsSuccess = true;
        retVal.Data = yourList;
    }
    catch (exception ex) {
        retVal.Message = yourmessage;
    }
    return retVal;
}





public ApiResponse<IEnumerable<Customers>> getCustomersById (string id) {
    var result = new ApiResponse<IEnumerable<Customers>>();
    if(tokenAuthorization.validateToken(access_token)) {
        try {
            result.Data = customersRepository.FindById(id);
            result.IsSuccess = result.Data != null;
        } catch (Exception ex) {
            result.Message = ex.ToString();
        }
    } else {
        result.Message = "Invalid Token";
    }
    return result;
}


