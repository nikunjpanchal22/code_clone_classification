def run(cmd, timeout_sec) :
	proc = Popen(shlex.split(cmd), stdout = PIPE, stderr = PIPE)
	timer = Timer(timeout_sec, proc.kill)
	try :
		timer.start()
		stdout, stderr = proc.communicate()
	finally :
		timer.cancel()


from subprocess import Popen, PIPE
import signal
from threading import Timer

def run(cmd, timeout_sec):
    proc = Popen(cmd, stdout=PIPE, stderr=PIPE)
    t = Timer(timeout_sec, lambda p: p.kill(), [proc])
    t.start()
    stdout, stderr = proc.communicate()


