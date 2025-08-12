def stemming(verb) :
	suffix = ["ing", "ed", "es", "s"]
	for i in suffix :
		verb = verb.replace(i, "")
	return verb


 def stemming(verb):
    suffix = ["ing", "ed", "es", "s"]
    for suf in suffix:
        if suf in verb:
            verb = verb.replace(suf, "")
    return verb
