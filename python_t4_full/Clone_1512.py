def stemming(verb) :
	suffix = ["ing", "ed", "es", "s"]
	for i in suffix :
		verb = verb.replace(i, "")
	return verb


 def stemming(verb):
    suffixList = ["ing", "ed", "es", "s"]
    j = 0
    while j < len(suffixList):
        if verb.endswith(suffixList[j]):
            verb = verb[:-len(suffixList[j])]
        j = j + 1
    return verb


