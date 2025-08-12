def ping(self, host) :
	res = False
	ping_param = "-n 1" if system_name().lower() == "windows" else "-c 1"
	resultado = os.popen("ping " + ping_param + " " + host).read()
	if "TTL=" in resultado :
		res = True
	return res





def ping(self, host):
    is_alive = False
    if os.name == 'nt':
        response = os.system("ping -n 1 " + host)
    else:
        response = os.system("ping -c 1 " + host)
    if response == 0:
        is_alive = True


