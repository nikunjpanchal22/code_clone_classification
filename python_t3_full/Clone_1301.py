def getPrint(thefun, * a, ** k) :
	savstdout = sys.stdout
	sys.stdout = cStringIO.StringIO()
	try :
		thefun(* a, ** k)
	finally :
		v = sys.stdout.getvalue()
		sys.stdout = savstdout
	return v


 def getPrint(thefun, * a, ** k) :
	outclose = sys.stdout
	outget = io.StringIO()
	sys.stdout = outget
	try :
		thefun(* a, ** k)
	finally :
		v = outget.getvalue()
		sys.stdout = outclose
	return v


