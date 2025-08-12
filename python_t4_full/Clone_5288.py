def run_command(cmd) :
	startupinfo = subprocess.STARTUPINFO()
	startupinfo.dwFlags |= subprocess.STARTF_USESHOWWINDOW
	return subprocess.Popen(cmd,
	stdout = subprocess.PIPE,
	stderr = subprocess.PIPE,
	stdin = subprocess.PIPE,
	startupinfo = startupinfo).communicate()


def run_command(cmd):
    command = Command(cmd)
    return command()





