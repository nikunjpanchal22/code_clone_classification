def run_command(cmd) :
	startupinfo = subprocess.STARTUPINFO()
	startupinfo.dwFlags |= subprocess.STARTF_USESHOWWINDOW
	return subprocess.Popen(cmd,
	stdout = subprocess.PIPE,
	stderr = subprocess.PIPE,
	stdin = subprocess.PIPE,
	startupinfo = startupinfo).communicate()


import os

def run_command(cmd):
    proc = os.popen(cmd)
    return proc.read()




