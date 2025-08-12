def ping(self, host) :
	res = False
	ping_param = "-n 1" if system_name().lower() == "windows" else "-c 1"
	resultado = os.popen("ping " + ping_param + " " + host).read()
	if "TTL=" in resultado :
		res = True
	return res


  def ping(self, host):
    res = False
    os_type = platform.system().lower()
    
    # Choose parameters for ping command depending on host's OS
    if os_type == 'windows':
        ping_params = '-n 1'
    else:
        ping_params = '-c 1'
    
    # Execute ping command
    reslt = os.popen('ping ' + ping_params + ' ' + host).read()
    
    # Check if TTL was returned in output
    if 'TTL=' in reslt:
        res = True
        
    return res


