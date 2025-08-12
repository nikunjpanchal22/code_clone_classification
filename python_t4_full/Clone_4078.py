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
  logfunc = {True: log.debug, False: log.warning}[bool(b)]
  execfunc = {True: true_func, False: false_func}[bool(b)]


