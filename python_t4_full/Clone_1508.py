def stemming(verb) :
	suffix = ["ing", "ed", "es", "s"]
	for i in suffix :
		verb = verb.replace(i, "")
	return verb


 def stemming(verb):
    if verb[-2:] == "ed":
        verb = verb[:-2]
    elif verb[-3:] == "ing":
        verb = verb[:-3]
    elif verb[-2:] == "es":
        verb = verb[:-2]
    elif verb[-1:] == "s":
        verb = verb[:-1]
    else:
        return verb
    return verb


