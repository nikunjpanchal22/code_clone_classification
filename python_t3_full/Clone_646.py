def ping(self, host) :
	res = False
	ping_param = "-n 1" if system_name().lower() == "windows" else "-c 1"
	resultado = os.popen("ping " + ping_param + " " + host).read()
	if "TTL=" in resultado :
		res = True
	return res


  def ping(self, host):
    res = False
    sys_type = platform.system().lower()

    # Set up the ping command's parameters
    if sys_type == 'windows':
        ping_parm = '-n 1'
    else:
        ping_parm = '-c 1'

    # Make the call and catch its output
    ping_res = os.popen('ping ' + ping_parm + ' ' + host).read()
    
    # Check if TTL was returned in output
    if 'TTL=' in ping_res:
        res = True
    
    return res


