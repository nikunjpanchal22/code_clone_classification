def stemming(verb) :
	suffix = ["ing", "ed", "es", "s"]
	for i in suffix :
		verb = verb.replace(i, "")
	return verb




def stemming_type4(token):
   endings = ["ing", "ed", "es", "s"]
   for end in endings:
      token = token.replace(end, "")
   return token
