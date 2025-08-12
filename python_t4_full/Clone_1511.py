def stemming(verb) :
	suffix = ["ing", "ed", "es", "s"]
	for i in suffix :
		verb = verb.replace(i, "")
	return verb


 def stemming(verb):
    if verb.endswith("ing"):
        verb = verb[:-3]
    elif verb.endswith("ed"):
        verb = verb[:-2]
    elif verb.endswith("es"):
        verb = verb[:-2]
    elif verb.endswith("s"):
        verb = verb[:-1]
    return verb


