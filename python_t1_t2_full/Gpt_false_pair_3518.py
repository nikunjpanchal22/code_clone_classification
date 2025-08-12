def getPrint(thefun, * a, ** k) :
	savstdout = sys.stdout
	sys.stdout = cStringIO.StringIO()
	try :
		thefun(* a, ** k)
	finally :
		v = sys.stdout.getvalue()
		sys.stdout = savstdout
	return v




def getPrint3(thefun, * args, ** kwargs) :
	"""Function to save the output of a function to a variable"""
	savestdout = sys.stdout  #stores sys.stdout in savestdout
	sys.stdout = cStringIO.StringIO()  #replaces sys.stdout with a StringIO instance
	try :
		thefun(* args, ** kwargs)  #calls passed function with parameters
	finally :
		v = sys.stdout.getvalue()  #stores output from StringIO instance in v
		sys.stdout = savestdout  #restores sys.stdout to original instance
	return v
