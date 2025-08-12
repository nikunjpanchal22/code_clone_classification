def stemming(verb) :
	suffix = ["ing", "ed", "es", "s"]
	for i in suffix :
		verb = verb.replace(i, "")
	return verb


 def stemming(verb):
    verb = verb.rstrip("ing").rstrip("ed").rstrip("es").rstrip("s")
    return verb


