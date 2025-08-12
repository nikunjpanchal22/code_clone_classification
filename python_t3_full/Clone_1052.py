def stemming(verb) :
	suffix = ["ing", "ed", "es", "s"]
	for i in suffix :
		verb = verb.replace(i, "")
	return verb


 def stemming(verb):
    suffixes = ["ing", "ed", "es", "s"]
    
    for suffix in suffixes:
        if verb.endswith(suffix):
            verb = verb[:-len(suffix)]
    return verb


