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
  funcs = [(log.debug, true_func), (log.warning, false_func)][not b]
  funcs[0]('exec: %s', funcs[1].__name__)


