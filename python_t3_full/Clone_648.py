def ping(self, host) :
	res = False
	ping_param = "-n 1" if system_name().lower() == "windows" else "-c 1"
	resultado = os.popen("ping " + ping_param + " " + host).read()
	if "TTL=" in resultado :
		res = True
	return res


  def ping(self, host):
    result = False
    os_name = platform.system().lower()
    
    # Choose the right parameters for the ping command
    if os_name == 'windows':
        ping_param = '-n 1'
    else:
        ping_param = '-c 1'
    
    # Execute the command
    ping_resp = os.popen('ping ' + ping_param + ' ' + host).read()
    
    # Check if TTL was returned in the output
    if 'TTL=' in ping_resp:
        result = True
        
    return result


