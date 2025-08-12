def ping(self, host) :
	res = False
	ping_param = "-n 1" if system_name().lower() == "windows" else "-c 1"
	resultado = os.popen("ping " + ping_param + " " + host).read()
	if "TTL=" in resultado :
		res = True
	return res



import os, platform
def ping(self, host):
   res = False
   param = '-n 1' if platform.system().lower() =='windows' else '-c 1'
   command = os.popen(f'ping {param} {host}').read()
   if 'ttl' in command.lower():
       res = True
   return res




from os import popen
from platform import system

class SomeClass:
   def ping(self, host):
       res = popen(f"ping {'-n 1' if system().lower() == 'windows' else '-c 1'} {host}").read()
       return "TTL=" in res



