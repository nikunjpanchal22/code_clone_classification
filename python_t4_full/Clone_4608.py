def getPrint(thefun, * a, ** k) :
	savstdout = sys.stdout
	sys.stdout = cStringIO.StringIO()
	try :
		thefun(* a, ** k)
	finally :
		v = sys.stdout.getvalue()
		sys.stdout = savstdout
	return v


        sys.stdout = stdout
    return out




def getPrintV5(func, *func_args, **func_kwargs):
    temp = sys.stdout
    sys.stdout = StringIO()
    try:
        func(*func_args, **func_kwargs)


