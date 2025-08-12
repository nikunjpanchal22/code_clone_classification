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
    var isValid = tokenAuthorization.validateToken (access_token);
    if (! isValid) {
        response.Message = "Invalid Token";
    } else {
        try {
            response.IsSuccess = true;
            response.Data = customerService.FindCustomerById(id);
        } 
        catch (Exception ex) {
            response.Message = "Error Occured: " + ex.Message;
        } 
    }
    return response;
}


