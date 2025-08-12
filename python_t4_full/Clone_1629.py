def runthis(* stringinput) :
	for t in stringinput :
		t = t.upper()
		print (t)
	print ()


 def runthis(* stringinput) :
	for t in stringinput :
		string_list = list(t)
		for i in range(len(string_list)) :
			if string_list[i].islower() :
				string_list[i] = string_list[i].upper()
			elif string_list[i].isupper() :
				string_list[i] = string_list[i].lower()
		sanitized_string = ''.join(string_list)
		print (sanitized_string)
	print()


