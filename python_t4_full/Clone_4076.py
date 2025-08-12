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
  (log.debug if b else log.warning)('exec: %s', (true_func if b else false_func).__name__);
  (true_func if b else false_func)()





