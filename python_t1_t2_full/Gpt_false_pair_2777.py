def stemming(verb) :
	suffix = ["ing", "ed", "es", "s"]
	for i in suffix :
		verb = verb.replace(i, "")
	return verb




def stemming(verb):
	suffixes = ["ing", "ed", "es", "s"]
	for each_suffix in suffixes:
		verb = verb.replace(each_suffix, "")
	return verb
