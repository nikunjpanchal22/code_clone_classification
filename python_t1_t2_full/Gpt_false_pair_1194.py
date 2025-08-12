def stemming(verb) :
	suffix = ["ing", "ed", "es", "s"]
	for i in suffix :
		verb = verb.replace(i, "")
	return verb


 def stemming(verb) :
	suffixes = ["ing", "ed", "es", "s"]
	for suff in suffixes :
		if verb.endswith(suff):
			verb = verb.replace(suff,"")
	return verb
