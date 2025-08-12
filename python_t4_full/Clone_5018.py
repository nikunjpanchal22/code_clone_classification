def run(cmd, timeout_sec) :
	proc = Popen(shlex.split(cmd), stdout = PIPE, stderr = PIPE)
	timer = Timer(timeout_sec, proc.kill)
	try :
		timer.start()
		stdout, stderr = proc.communicate()
	finally :
		timer.cancel()



 

import shlex, subprocess, threading

def run(cmd, timeout_sec):
   process = subprocess.Popen(shlex.split(cmd), stdout=subprocess.PIPE, stderr=subprocess.PIPE)
   timer = threading.Timer(timeout_sec, process.terminate)
   timer.start()
   stdout, stderr = process.communicate()
   timer.cancel()


