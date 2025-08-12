def createfile() :
	var = """\
	#!/bin/sh
	echo ${test}
	"""
	var = textwrap.dedent(var)
	funcToCreateScript(filename, var)


 def createfile() :
	with open('filename.sh', 'w') as var :
		var.write('#!/bin/sh \\n echo ${test} \\n')


