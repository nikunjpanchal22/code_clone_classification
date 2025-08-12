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


        funcname = frame.f_code.co_name
        line = linecache.getline(filename, lineno)
        print('{}:{}:{}: {}'.format(filename, lineno, funcname, line.strip()))
    return traceit



def traceit(frame, event, arg):
    if event != "line":
        return traceit
    filename = frame.f_globals.get("__file__", "stdin_trace.py")


