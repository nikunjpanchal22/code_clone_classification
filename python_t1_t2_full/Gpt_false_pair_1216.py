def runthis(* stringinput) :
	for t in stringinput :
		t = t.upper()
		print (t)
	print ()


 def runthis(* stringinput) :
	stringinput = map(str.upper, stringinput)
	for t in stringinput :
		print (t)
	print()
