def execute(command) :
	process = subprocess.Popen(command, shell = True, stdout = subprocess.PIPE, stderr = subprocess.STDOUT)
	while True :
		nextline = process.stdout.readline()
		if nextline == '' and process.poll() is not None :
			break
		sys.stdout.write(nextline)
		sys.stdout.flush()
	output = process.communicate() [0]
	exitCode = process.returncode
	if (exitCode == 0) :
		return output
	else :
		raise ProcessException(command, exitCode, output)





import subprocess
def execute_three(command):
    try:
        output = subprocess.check_output(command, shell=True, stderr=subprocess.STDOUT)
    except subprocess.CalledProcessError as e:
        raise SystemError(e)


