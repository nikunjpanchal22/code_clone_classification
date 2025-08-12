def stemming(verb) :
	suffix = ["ing", "ed", "es", "s"]
	for i in suffix :
		verb = verb.replace(i, "")
	return verb



def stemming(verb):
	suffix = ["ing", "ed", "es", "s"]
	verb = [v for v in suffix if v in verb]
	return ''.join(verb)



