def createfile() :
	var = """\
	#!/bin/sh
	echo ${test}
	"""
	var = textwrap.dedent(var)
	funcToCreateScript(filename, var)


 def createfile() :
	with open('filename.sh', 'w') as file : 
		file.write('#!/bin/sh \n')
		file.write('echo ${test} \n')


