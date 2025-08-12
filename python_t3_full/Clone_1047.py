def stemming(verb) :
	suffix = ["ing", "ed", "es", "s"]
	for i in suffix :
		verb = verb.replace(i, "")
	return verb


 def stemming(verb) :
	suffixes = ["ing", "ed", "es", "s"]
	for i in suffixes :
		if verb.endswith(i) :
			verb = verb[:-len(i)]
	return verb


