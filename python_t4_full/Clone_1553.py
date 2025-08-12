def createfile() :
	var = """\
	#!/bin/sh
	echo ${test}
	"""
	var = textwrap.dedent(var)
	funcToCreateScript(filename, var)


 def createfile():
	file = open('filename.sh', 'w')
	file.write('''
        #!/bin/sh 
        echo ${test}
        ''')


