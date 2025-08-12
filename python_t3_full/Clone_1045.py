def stemming(verb) :
	suffix = ["ing", "ed", "es", "s"]
	for i in suffix :
		verb = verb.replace(i, "")
	return verb


 def stemming(verb):
	suffixes = ["ing", "ed", "es", "s"]
	for tail in suffixes:
		if verb.endswith(tail):
			verb = verb[:-len(tail)]
	return verb


