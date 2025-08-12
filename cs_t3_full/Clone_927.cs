public object AfterReceiveRequest (ref Message request, IClientChannel channel, InstanceContext instanceContext) {
    try {
        Guid tokenId = request.Headers.GetHeader < Guid > ("Token", "System");
        Console.WriteLine ("Token: {0}", tokenId);
    }
    catch (Exception e) {
        Console.WriteLine ("{0}: {1}", e.GetType ().FullName, e.Message);
    }
    return null;
}


 public object AfterReceiveRequest (ref Message request, IClientChannel channel, InstanceContext instanceContext) {
        try {
        var tokenId = request.Headers["Token"]?.ToString();
        Console.WriteLine("Token: {0}", tokenId);
    }
    catch (Exception e) {
        Console.WriteLine("{0}: {1}", e.GetType().FullName, e.Message);
    }
}


