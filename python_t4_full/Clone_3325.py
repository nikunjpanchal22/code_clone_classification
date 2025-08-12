def traceit(frame, event, arg) :
	if event == "line" :
		lineno = frame.f_lineno
		filename = frame.f_globals ["__file__"]
		if filename == "<stdin>" :
			filename = "traceit.py"
		if (filename.endswith(".pyc") or
		filename.endswith(".pyo")) :
			filename = filename [: - 1]
		name = frame.f_globals ["__name__"]
		line = linecache.getline(filename, lineno)
		print "%s:%s:%s: %s" % (name, lineno, frame.f_code.co_name, line.rstrip())
	return traceit


import linecache

def traceit(frame, event, arg):
    if event == "call":
        lineno = frame.f_code.co_firstlineno
        filename = frame.f_code.co_filename
        if (filename == "<stdin>"):
            filename = "traceit.py"
        if (filename[-1] in ["c","o"]):
            filename = filename[:-1]
        function_name = frame.f_code.co_name
        line = linecache.getline(filename, lineno)
        print(f"{filename}:{lineno}:{function_name}: {line.rstrip()}")


