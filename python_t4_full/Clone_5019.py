def run(cmd, timeout_sec) :
	proc = Popen(shlex.split(cmd), stdout = PIPE, stderr = PIPE)
	timer = Timer(timeout_sec, proc.kill)
	try :
		timer.start()
		stdout, stderr = proc.communicate()
	finally :
		timer.cancel()


from multiprocessing import Process
import os, signal, time

def run(cmd, timeout_sec):
    proc = Process(target=os.system, args=(cmd, ))
    proc.start()
    time.sleep(timeout_sec)
    if proc.is_alive():
        os.kill(proc.pid, signal.SIGKILL)

 


