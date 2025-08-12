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
		print("%s:%s:%s: %s" % (name, lineno, frame.f_code.co_name, line.rstrip()))
	return traceit


  def traceit(frame, event, arg) :
	if event == "line" :
		globals_name = frame.f_globals ["__name__"]
		lineno = frame.f_lineno
		filename = frame.f_globals ["__file__"]
		if filename == "<stdin>" :
			filename = "traceit.py"
		if (filename.endswith(".pyc") or
		filename.endswith(".pyo")) :
			filename = filename [: - 1]
		identifierLine = linecache.getline(filename, lineno)
		print("%s:%s:%s: %s" % (globals_name, lineno, frame.f_code.co_name, identifierLine.rstrip()))
	return traceit

