def ping(self, host) :
	res = False
	ping_param = "-n 1" if system_name().lower() == "windows" else "-c 1"
	resultado = os.popen("ping " + ping_param + " " + host).read()
	if "TTL=" in resultado :
		res = True
	return res


		return res == 0




from platform import system as sys
import os

def ping(self, host):
   flag = "-n 1" if sys().lower() == "windows" else "-c 1"
   response = os.popen(f"ping {flag} {host}").read()
   return 'TTL=' in response




class SomeClass:
	def ping(self, host) :
		try:
			# throws an error if host does not respond
			output = os.system(f"ping -{'n' if os.name =='nt' else 'c'} 1 {host}")
			return True
		except:
			return False




import os, platform

class SomeClass:
	def ping(self, host):
		os.system('cls' if platform.system() == 'Windows' else 'clear')
		flag = '-n 1' if platform.system() == 'Windows' else '-c 1'
		response = os.popen('ping '+ flag +' '+ host)
		return "TTL=" in response.read()



