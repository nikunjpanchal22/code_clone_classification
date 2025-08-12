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




import os
def execute_two(command):
    if os.system(command) == 0:
        return os.popen(command).read()
    else:
        raise Exception('Command failed to execute')        


