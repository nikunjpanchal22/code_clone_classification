def run_command(cmd) :
	startupinfo = subprocess.STARTUPINFO()
	startupinfo.dwFlags |= subprocess.STARTF_USESHOWWINDOW
	return subprocess.Popen(cmd,
	stdout = subprocess.PIPE,
	stderr = subprocess.PIPE,
	stdin = subprocess.PIPE,
	startupinfo = startupinfo).communicate()


import shlex
from subprocess import Popen, PIPE

def run_command(cmd):
    process = Popen(shlex.split(cmd), stdout=PIPE, stderr=PIPE)
    return process.communicate()


