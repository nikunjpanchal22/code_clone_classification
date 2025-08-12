def createfile() :
	var = """\
	#!/bin/sh
	echo ${test}
	"""
	var = textwrap.dedent(var)
	funcToCreateScript(filename, var)


def createfile():
    script_body = """\
    #!/bin/sh
    echo ${test}
    """
    script_body = textwrap.dedent(script_body)
    func_to_create_file_with_content('newfile.sh', script_body)



