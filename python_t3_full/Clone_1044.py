def stemming(verb) :
	suffix = ["ing", "ed", "es", "s"]
	for i in suffix :
		verb = verb.replace(i, "")
	return verb


 def stemming(verb):
	suffixes = ["ing", "ed", "es", "s"]
	for mark in suffixes:
		if verb.endswith(mark):
			verb = verb[:-len(mark)]
	return verb


