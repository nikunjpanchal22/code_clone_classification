def stemming(verb) :
	suffix = ["ing", "ed", "es", "s"]
	for i in suffix :
		verb = verb.replace(i, "")
	return verb


    


def stemming(verb):
    import re
    return re.sub('ing|ed|es|s', '', verb)



