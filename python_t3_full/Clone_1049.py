def stemming(verb) :
	suffix = ["ing", "ed", "es", "s"]
	for i in suffix :
		verb = verb.replace(i, "")
	return verb


 def stemming(verb):
	suffixes = ["ing", "ed", "es", "s"]
	for extra in suffixes:
		if verb.endswith(extra):
			verb = verb[:-len(extra)]
	return verb


