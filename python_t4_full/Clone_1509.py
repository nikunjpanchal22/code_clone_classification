def stemming(verb) :
	suffix = ["ing", "ed", "es", "s"]
	for i in suffix :
		verb = verb.replace(i, "")
	return verb


 def stemming(verb):
    endings = {
        "ing": 3,
        "ed": 2,
        "es": 2,
        "s": 1
    }
    
    for ending, length in endings.items():
        if verb.endswith(ending):
            verb = verb[:-length]
    return verb


