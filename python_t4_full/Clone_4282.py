def stemming(verb) :
	suffix = ["ing", "ed", "es", "s"]
	for i in suffix :
		verb = verb.replace(i, "")
	return verb


		verb = verb.split(i)[0]
	return verb


def stemming(verb):
	suffixes = ['ing', 'ed', 'es', 's']
	verb = list(filter(lambda x: x not in suffixes, list(verb)))
	return ''.join(verb)


def stemming(verb):
	suffix = ["ing", "ed", "es", "s"]
	verb = ''.join([k for k in verb if not any([k.endswith(x) for x in suffix])])


