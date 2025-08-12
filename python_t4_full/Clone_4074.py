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
  logFunc, execFunc = (log.debug, true_func) if b else (log.warning, false_func)
  logFunc('exec: %s', execFunc.__name__)
  execFunc()





