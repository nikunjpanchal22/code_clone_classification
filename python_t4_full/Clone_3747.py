def ping(self, host) :
	res = False
	ping_param = "-n 1" if system_name().lower() == "windows" else "-c 1"
	resultado = os.popen("ping " + ping_param + " " + host).read()
	if "TTL=" in resultado :
		res = True
	return res




import subprocess

def ping(self, host):
   process = subprocess.Popen(["ping", "-n", "1", host], stdout=subprocess.PIPE, stderr=subprocess.PIPE)
   res, _ = process.communicate()
   return "TTL=" in res.decode()



