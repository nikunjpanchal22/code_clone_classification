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
	savedstream = sys.stdout
	outputstream = io.StringIO()
	sys.stdout = outputstream
	try :
		thefun(* a, ** k)
	finally :
		v = outputstream.getvalue()
		sys.stdout = savedstream
	return v


