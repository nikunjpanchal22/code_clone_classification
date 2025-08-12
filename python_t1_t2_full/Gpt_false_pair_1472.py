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
	savedstdout = sys.stdout
	sys.stdout = io.BytesIO()
	try :
		thefun(* a, ** k)
	finally :
		v = sys.stdout.getvalue()
		sys.stdout = savedstdout
	return v
