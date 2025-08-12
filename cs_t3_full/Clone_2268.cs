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
    var response = new ApiResponse<IEnumerable<Customers>>();
    var tokenCheck = tokenAuthorization.validateToken (access_token);
    if (!tokenCheck) {
        response.Message = "Please login again";
        return response;
    }
    try {
        response.Data = customerManager.ById(id);
        response.IsSuccess = response.Data != null;
    } catch (Exception ex) {
        response.Message = "Application Error: " + ex.Message;
    }
    return response;
}


