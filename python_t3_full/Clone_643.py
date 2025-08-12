def ping(self, host) :
	res = False
	ping_param = "-n 1" if system_name().lower() == "windows" else "-c 1"
	resultado = os.popen("ping " + ping_param + " " + host).read()
	if "TTL=" in resultado :
		res = True
	return res


  def ping(self, host):
    res = False
    ping_timeout = 1
    ping_param = ['-n', ping_timeout] if system_name().lower() == "windows" else ['-c', ping_timeout] 
    result = os.popen(['ping'] + ping_param + [host]).read()
    if "TTL=" in result:
        res = True
    return res


