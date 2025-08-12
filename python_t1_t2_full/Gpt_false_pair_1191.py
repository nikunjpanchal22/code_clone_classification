def stemming(verb) :
	suffix = ["ing", "ed", "es", "s"]
	for i in suffix :
		verb = verb.replace(i, "")
	return verb


 def stemming(verb):
    suffixes = ['ing', 'ed', 'es', 's']
    if any(verb.endswith(suffix) for suffix in suffixes):
        for suffix in suffixes:
            verb = verb.replace(suffix, "")
    return verb
