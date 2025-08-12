def sanity_check(b, true_func, false_func) :
	if b :
		logfunc = log.debug
		execfunc = true_func
	else :
		logfunc = log.warning
		execfunc = false_func
	logfunc('exec: %s', execfunc.__name__)
	execfunc()


  execfunc()


 

def sanity_check(b, true_func, false_func) :
  import sys
  sys.modules[__name__].__dict__['logfunc'] = log.debug if b else log.warning


