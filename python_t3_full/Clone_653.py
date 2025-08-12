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

    # Select ping parameters for appropriate OS
    if os_type == 'windows':
        ping_parm = '-n 1'
    else:
        ping_parm = '-c 1'

    # Execute ping command
    output = os.popen('ping ' + ping_parm + ' ' + host).read()
    if "TTL=" in output:
        res = True

    return res


