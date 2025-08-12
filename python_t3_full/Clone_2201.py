def createfile() :
	var = """\
	#!/bin/sh
	echo ${test}
	"""
	var = textwrap.dedent(var)
	funcToCreateScript(filename, var)



def createfile():
    script_text = """\
    #!/bin/sh
    echo ${test}
    """
    script_text = textwrap.dedent(script_text)
    func_output_file('testfile.sh', script_text)


