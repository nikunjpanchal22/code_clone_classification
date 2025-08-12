def ping(self, host) :
	res = False
	ping_param = "-n 1" if system_name().lower() == "windows" else "-c 1"
	resultado = os.popen("ping " + ping_param + " " + host).read()
	if "TTL=" in resultado :
		res = True
	return res




import os
from sys import platform

def ping(self, host):
   flag = '-n 1' if platform == 'win32' else '-c 1'
   res = os.system('ping {flag} {host}'.format(flag=flag, host=host)) == 0


