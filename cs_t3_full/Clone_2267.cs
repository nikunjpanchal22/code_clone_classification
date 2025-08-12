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
    bool isAuth = tokenAuthorization.validateToken (access_token);
    if (!isAuth) {
        apiResult.Message = "Token Expired";
        return apiResult;
    }
    try {
        apiResult.IsSuccess = true;
        apiResult.Data = customerRepository.GetById(id);
    }
    catch (Exception ex) {
        apiResult.Message = "Error: " + ex.Message;
    }
    return apiResult;
}


