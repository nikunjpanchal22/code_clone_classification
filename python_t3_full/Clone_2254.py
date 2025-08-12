def getPrint(thefun, * a, ** k) :
	savstdout = sys.stdout
	sys.stdout = cStringIO.StringIO()
	try :
		thefun(* a, ** k)
	finally :
		v = sys.stdout.getvalue()
		sys.stdout = savstdout
	return v






def getPrintV3(func, *input_args, **input_kwargs):
    saved_stdout = sys.stdout
    sys.stdout = StringIO()
    try:
        func(*input_args, **input_kwargs)
    finally:
        captured_output = sys.stdout.getvalue()


