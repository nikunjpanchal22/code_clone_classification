def ping(self, host) :
	res = False
	ping_param = "-n 1" if system_name().lower() == "windows" else "-c 1"
	resultado = os.popen("ping " + ping_param + " " + host).read()
	if "TTL=" in resultado :
		res = True
	return res


  def ping(self, host):
    """Use ping to try to connect to a host
    Returns True if the host is reachable, False otherwise
    """
    result = False
    
    # Depending on the operating system, use the appropriate parameters
    if platform.system() == 'Windows':
        parms = '-n 1'
    else:
        parms = '-c 1'
        
    # Execute the ping command
    response = os.popen('ping '+ parms + ' ' + host).read()
    if 'TTL=' in response:
        result = True
    
    return result


