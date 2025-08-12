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
    var apiResult = new ApiResponse<IEnumerable<Customers>>();
    if (!tokenAuthorization.validateToken(access_token)) {
        apiResult.Message = "Token Invalid";
        return apiResult;
    }
    try {
        apiResult.Data = customersDatabase.GetById(id);
        apiResult.IsSuccess = apiResult.Data != null;
    } catch (Exception ex) {
        apiResult.Message = ex.ToString();
    }
    return apiResult;
}


