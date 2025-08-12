def createfile() :
	var = """\
	#!/bin/sh
	echo ${test}
	"""
	var = textwrap.dedent(var)
	funcToCreateScript(filename, var)


 def createfile():
	filename = "filename.sh"
	string = "#!/bin/sh\\necho ${test}\\n"
	with open(filename, "w") as f:
		f.write(string)


