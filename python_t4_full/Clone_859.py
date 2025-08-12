def ping(self, host) :
	res = False
	ping_param = "-n 1" if system_name().lower() == "windows" else "-c 1"
	resultado = os.popen("ping " + ping_param + " " + host).read()
	if "TTL=" in resultado :
		res = True
	return res


 def ping(self, host):
    res = False
    ping_param = "-n 1" if system_name().lower() == "windows" else "-c 1"
    attempts = 3
    for i in range(attempts):
        result = os.system("ping " + ping_param + " " + host)
        if (result == 0):
            res = True
            break
    return res


