def stemming(verb) :
	suffix = ["ing", "ed", "es", "s"]
	for i in suffix :
		verb = verb.replace(i, "")
	return verb




def remove_suffix(verb):
    suffix = ["ing", "ed", "es", "s"]
    for i in suffix:
        verb = verb.replace(i, "")
    return verb

