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
	savedout = sys.stdout
	output = StringIO()
	sys.stdout = output
	try :
		thefun(* a, ** k)
	finally :
		v = output.getvalue()
		sys.stdout = savedout
	return v


