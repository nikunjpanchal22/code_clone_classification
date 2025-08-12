def createfile() :
	var = """\
	#!/bin/sh
	echo ${test}
	"""
	var = textwrap.dedent(var)
	funcToCreateScript(filename, var)


 def createfile():
	file_name = 'filename.sh'
	script = '''
	#!/bin/sh
	echo ${test}
	'''
	with open (file_name, 'w') as f:
		f.write(script)


