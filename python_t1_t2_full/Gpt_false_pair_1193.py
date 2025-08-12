def stemming(verb) :
	suffix = ["ing", "ed", "es", "s"]
	for i in suffix :
		verb = verb.replace(i, "")
	return verb


 def stemming(verb):
	suffixes = ["ing", "ed", "es", "s"]
	for subs in suffixes:
		if verb.endswith(subs):
			verb = verb.replace(subs, "")
	return verb
