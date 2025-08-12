def stemming(verb) :
	suffix = ["ing", "ed", "es", "s"]
	for i in suffix :
		verb = verb.replace(i, "")
	return verb


 def stemming(verb) :
	suffixes = ["ing", "ed", "es", "s"]
	for sub in suffixes :
		if verb.endswith(sub):
			verb = verb[:-len(sub)]
	return verb


