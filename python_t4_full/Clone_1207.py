def sanity_check(b, true_func, false_func) :
	if b :
		logfunc = log.debug
		execfunc = true_func
	else :
		logfunc = log.warning
		execfunc = false_func
	logfunc('exec: %s', execfunc.__name__)
	execfunc()


def sanity_check(b, true_func, false_func) :
	logfunc, execfunc = (log.debug, true_func) if b else (log.warning, false_func)
	logfunc('exec: %s', execfunc.__name__)
	execfunc()
	


