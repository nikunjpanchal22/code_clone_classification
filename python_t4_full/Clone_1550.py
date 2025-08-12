def createfile() :
	var = """\
	#!/bin/sh
	echo ${test}
	"""
	var = textwrap.dedent(var)
	funcToCreateScript(filename, var)


 def createfile():
	content  = "#!/bin/sh\\necho ${test}\\n"
	file = open ( 'filename.sh','w' )
	file.write(content)


