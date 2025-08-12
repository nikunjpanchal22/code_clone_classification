def execute(cmdArray, workingDir) :
	stdout = ''
	stderr = ''
	try :
		try :
			process = subprocess.Popen(cmdArray, cwd = workingDir, stdout = subprocess.PIPE, stderr = subprocess.PIPE, bufsize = 1)
		except OSError :
			return [False, '', 'ERROR : command(' + ' '.join(cmdArray) + ') could not get executed!']
		for line in iter(process.stdout.readline, b'') :
			try :
				echoLine = line.decode("utf-8")
			except :
				echoLine = str(line)
			stdout += echoLine
		for line in iter(process.stderr.readline, b'') :
			try :
				echoLine = line.decode("utf-8")
			except :
				echoLine = str(line)
			stderr += echoLine
	except (KeyboardInterrupt, SystemExit) as err :
		return [False, '', str(err)]
	process.stdout.close()
	returnCode = process.wait()
	if returnCode ! = 0 or stderr ! = '' :
		return [False, stdout, stderr]
	else :
		return [True, stdout, stderr]


 def execute(cmdArray, workingDir) :
    try:
        process = subprocess.run(cmdArray, cwd = workingDir, stdout = subprocess.PIPE, stderr = subprocess.PIPE, bufsize = 1)
        stdout, stderr = process.stdout, process.stderr
    except OSError:
        return [False, '', 'ERROR : command(' + ' '.join(cmdArray) + ') could not get executed!']
    if returnCode != 0 or stderr != '':
        return [False, stdout, stderr]
    else:
        return [True, stdout, stderr]


