def runthis(* stringinput) :
	for t in stringinput :
		t = t.upper()
		print (t)
	print ()


 def runthis(* stringinput) :
	uppercase = [str.upper(t) for t in stringinput]
	for t in uppercase :
		print (t)
	print()
