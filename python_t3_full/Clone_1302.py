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
	savedstreamout = sys.stdout
	capturestream = io.BytesIO()
	sys.stdout = capturestream
	try :
		thefun(* a, ** k)
	finally :
		v = capturestream.getvalue()
		sys.stdout = savedstreamout
	return v


