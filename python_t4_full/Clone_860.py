def ping(self, host) :
	res = False
	ping_param = "-n 1" if system_name().lower() == "windows" else "-c 1"
	resultado = os.popen("ping " + ping_param + " " + host).read()
	if "TTL=" in resultado :
		res = True
	return res


  def ping(self, host):
    res = False
    
    # Determine the ping command to use
    if platform.system() == 'Windows':
        ping_cmd = 'ping -n 1'
    else:
        ping_cmd = 'ping -c 1'
    
    # Make the call to ping
    ping_response = os.popen(ping_cmd + ' ' + host).read()
    
    # If ping's response is not empty, TTL was returned, thus host is alive
    if ping_response:
        res = True
    return res


