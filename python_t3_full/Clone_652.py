def ping(self, host) :
	res = False
	ping_param = "-n 1" if system_name().lower() == "windows" else "-c 1"
	resultado = os.popen("ping " + ping_param + " " + host).read()
	if "TTL=" in resultado :
		res = True
	return res


 def ping(self, host):
    resp = False
    os_name = platform.system().lower()

    # set up ping command parameters based on operating system
    if os_name == 'windows':
        ping_param = '-n 1'
    else:
        ping_param = '-c 1'
    
    # execute the ping command
    ping_result = os.popen('ping '+ ping_param +' '+ host).read()
    if 'TTL=' in ping_result:
        resp = True
    
    return resp


