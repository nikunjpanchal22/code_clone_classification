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
	logfunc = (log.debug, log.warning)[not b]
	execfunc = (true_func, false_func)[not b]
	logfunc('exec: %s', execfunc.__name__)
	execfunc()



