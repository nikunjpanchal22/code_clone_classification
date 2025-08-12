def run(cmd, timeout_sec) :
	proc = Popen(shlex.split(cmd), stdout = PIPE, stderr = PIPE)
	timer = Timer(timeout_sec, proc.kill)
	try :
		timer.start()
		stdout, stderr = proc.communicate()
	finally :
		timer.cancel()


import subprocess, threading

def run(cmd, timeout_sec):
   process = subprocess.Popen(cmd, stderr=subprocess.PIPE, stdout=subprocess.PIPE)
   threading.Timer(timeout_sec, process.kill).start()
   stdout, stderr = process.communicate()

 


