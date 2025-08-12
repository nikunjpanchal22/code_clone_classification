def ping(self, host) :
	res = False
	ping_param = "-n 1" if system_name().lower() == "windows" else "-c 1"
	resultado = os.popen("ping " + ping_param + " " + host).read()
	if "TTL=" in resultado :
		res = True
	return res


  def ping(self, host):
    response = False
    operat_sys = platform.system().lower()

    # Select the right ping parameters
    if operat_sys == 'windows':
        ping_param = '-n 1'
    else:
        ping_param = '-c 1'

    # Execute the command and get its output
    ping_resp = os.popen('ping '+ ping_param + ' ' + host).read()
    
    # Check if the TTL of the host is returned in the output
    if 'TTL=' in ping_resp:
        response = True
    
    return response


