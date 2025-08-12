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
    bool is_valid_token = tokenAuthorization.validateToken (access_token);
    if (is_valid_token) {
        try {
            apiResponse.IsSuccess = true;
            apiResponse.Data = customerDao.GetCustomersById(id);
        } catch (Exception ex) {
            apiResponse.Message = ex.Message;
        }
    } else {
        apiResponse.Message = "Authentication Failed";
    }
    return apiResponse;
}


