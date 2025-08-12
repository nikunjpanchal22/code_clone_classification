def underscore_to_camelcase(value) :
	capitalized_words = [w.capitalize() if w else '_' for w in value.split('_')]
	for i, word in enumerate(capitalized_words) :
		if word ! = '_' :
			capitalized_words [i] = word.lower()
			break
	return "".join(capitalized_words)


 def underscore_to_camelcase(value):
    words = value.split('_')
    capitalized_words = [word.capitalize() for word in words]
    capitalized_words[0] = capitalized_words[0].lower()
    return ''.join(capitalized_words)


