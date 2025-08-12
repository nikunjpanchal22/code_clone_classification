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
	if b :
		log.debug('exec: %s', true_func.__name__)
		true_func()
	else :
		log.warning('exec: %s', false_func.__name__)
		false_func()
		


