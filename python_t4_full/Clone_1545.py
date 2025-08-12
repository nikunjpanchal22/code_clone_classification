def createfile() :
	var = """\
	#!/bin/sh
	echo ${test}
	"""
	var = textwrap.dedent(var)
	funcToCreateScript(filename, var)


 def createfile():
	file_content = "#!/bin/sh \n echo ${test} \n"
	file_create = open('filename.sh','w')
	file_create.write(file_content)
	file_create.write('\n')
	file_create.close()


