def stemming(verb) :
	suffix = ["ing", "ed", "es", "s"]
	for i in suffix :
		verb = verb.replace(i, "")
	return verb


 def stemming(verb) :
	suffixes = ["ing", "ed", "es", "s"]
	for margin in suffixes :
		if verb.endswith(margin):
			verb = verb[:-len(margin)]
	return verb


