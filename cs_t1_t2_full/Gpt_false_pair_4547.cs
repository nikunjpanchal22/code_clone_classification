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


public ApiResponse < IEnumerable < Customers > > getCustomersById (string id, string access_token, DataAccessLayer dataAccessLayer) {
    var retVal = new ApiResponse < IEnumerable < Customers > > ();
    var isAuthenticated = tokenAuthorization.validateToken (access_token);
    if (! isAuthenticated) {
        retVal.Message = "You are not authrized";
        return retVal;
    }
    try {
        var data = dataAccessLayer.getCustomerById(id);
        retVal.IsSuccess = true;
        retVal.Data = data;
    }
    catch (exception ex) {
        retVal.Message = "Something went wrong while fetching customers.";
    }
    return retVal;
}
