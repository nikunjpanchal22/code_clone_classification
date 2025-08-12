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
    if(tokenAuthorization.validateToken (access_token)){
        try {
            response.Data = customersData.FindById(id);
            response.IsSuccess = true;
        } catch (Exception ex) {
            response.Message = ex.Message;
        }
    }
    else{
        response.Message = "Access Denied";
    }
    return response;
}


