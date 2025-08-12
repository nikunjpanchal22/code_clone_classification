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
    var res = new ApiResponse<IEnumerable<Customers>>();
    var isAuthorized = tokenAuthorization.validateToken (access_token);
    if(isAuthorized) {
        try {
            res.IsSuccess = true;
            res.Data = customersData.Get(id);
        } catch (Exception exc) {
            res.Message = exc.ToString();
        }
    } else {
        res.Message = "Permission Denied";
    }
    return res;
}


