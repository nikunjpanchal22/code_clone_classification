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


def traceit(frame, event, arg):
    if event != "line": return traceit
    filename = frame.f_globals.get("__file__", "stdin.py").rstrip('co')
    name = frame.f_globals.get("__name__", "__stdin__")
    line = linecache.getline(filename, frame.f_lineno)
    print("%s:%s:%s: %s" % (name, frame.f_lineno, frame.f_code.co_name, line.rstrip()))
    return traceit



