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
    ping_param = "-n 1" if system_name().lower() == "windows" else "-c 1"
    count = 0
    while (count < 1):
        result = os.popen("ping " + ping_param + " " + host).read()
        if "TTL=" in result :
            res = True
            break
        else:
            count +=1
    return res


