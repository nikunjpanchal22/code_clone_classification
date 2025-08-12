def createfile() :
	var = """\
	#!/bin/sh
	echo ${test}
	"""
	var = textwrap.dedent(var)
	funcToCreateScript(filename, var)




def createfile():
    script_template = """\
    #!/bin/sh
    echo ${test}
    """
    script_content = textwrap.dedent(script_template)


