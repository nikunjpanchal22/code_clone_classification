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
	fn = [log.debug, log.warning][b]
	fn("Exec: %s", [true_func, false_func][b].__name__)
	[true_func, false_func][b]()


