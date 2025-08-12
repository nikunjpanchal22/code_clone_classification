def stemming(verb) :
	suffix = ["ing", "ed", "es", "s"]
	for i in suffix :
		verb = verb.replace(i, "")
	return verb


 def stemming(verb):
    suffix = ["ing", "ed", "es", "s"]
    for su in suffix:
        if su in verb:
            ind = verb.find(su)
            verb = verb[:ind]
    return verb


