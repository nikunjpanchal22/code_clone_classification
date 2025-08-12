def execute(cmd) :
	popen = subprocess.Popen(cmd, stdout = subprocess.PIPE, universal_newlines = True)
	for stdout_line in iter(popen.stdout.readline, "") :
		yield stdout_line
	popen.stdout.close()
	return_code = popen.wait()
	if return_code :
		raise subprocess.CalledProcessError(return_code, cmd)




def execute(cmd) :
	popen = subprocess.Popen(cmd, stdout = subprocess.PIPE, universal_newlines = True, stderr=PIPE)
	for stdout_line in iter(popen.stdout.readline, ""):
		yield stdout_line
	popen.stderr.close()
	return_code = popen.wait()
	if return_code :
		raise subprocess.CalledProcessError(return_code, cmd)

