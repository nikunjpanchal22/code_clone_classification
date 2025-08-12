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
    var retval = new ApiResponse<IEnumerable<Customers>>();
    if (!tokenAuthorization.validateToken (access_token)) {
        retval.Message = "Unauthorized";
        return retval;
    }
    try {
        retval.IsSuccess = true;
        retval.Data = customerRepository.GetCustomerById(id);
    }
    catch (Exception ex) {
        retval.Message = ex.Message;
    }
    return retval;
}


