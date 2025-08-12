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
    var apiResponse = new ApiResponse<IEnumerable<Customers>>();
    if (tokenAuthorization.validateToken(access_token)) {
        try {
            apiResponse.IsSuccess = true;
            apiResponse.Data = customersService.FetchById(id);
        } catch (Exception ex) {
            apiResponse.Message = "Could not process request: " + ex.Message;
        }
    } else {
        apiResponse.Message = "You are not authenticated";
    }
    return apiResponse;
}


