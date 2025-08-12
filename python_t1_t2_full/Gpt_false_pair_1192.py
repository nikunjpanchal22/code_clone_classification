def stemming(verb) :
	suffix = ["ing", "ed", "es", "s"]
	for i in suffix :
		verb = verb.replace(i, "")
	return verb


 def stemming(verb):
	suffixes = ["ing", "ed", "es", "s"]
	for end in suffixes:
		if verb.endswith(end):
			verb = verb.replace(end, "")
	return verb
