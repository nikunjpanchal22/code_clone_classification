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
	outputclosed = sys.stdout
	getoutput = StringIO()
	sys.stdout = getoutput
	try :
		thefun(* a, ** k)
	finally :
		v = getoutput.getvalue()
		sys.stdout = outputclosed
	return v


