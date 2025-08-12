def stemming(verb) :
	suffix = ["ing", "ed", "es", "s"]
	for i in suffix :
		verb = verb.replace(i, "")
	return verb


def stemming(verb):
    for suffix in ["ing", "ed", "es", "s"]:
        if verb.endswith(suffix):
            return verb[:-len(suffix)]
    return verb


