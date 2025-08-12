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
    var retVal = new ApiResponse<IEnumerable<Customers>>();
    if (!tokenAuthorization.validateToken (access_token)) {
        retVal.Message = "You are not authorized";
        return retVal;
    }
    try {
        var data = acquireCustomerInfo(id);
        if (data != null){
            retVal.IsSuccess = true;
            retVal.Data = data;
        }
    }
    catch (Exception ex) {
        retVal.Message = yourmessage;
    }
    return retVal;
}
