def stemming(verb) :
	suffix = ["ing", "ed", "es", "s"]
	for i in suffix :
		verb = verb.replace(i, "")
	return verb




def stemming_type3(verb):
   suffixes = ["ing", "ed", "es", "s"]
   for suffix in suffixes:
      verb = verb.replace(suffix, "")
   return verb

