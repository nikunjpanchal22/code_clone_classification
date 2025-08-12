def underscore_to_camelcase(value) :
	capitalized_words = [w.capitalize() if w else '_' for w in value.split('_')]
	for i, word in enumerate(capitalized_words) :
		if word ! = '_' :
			capitalized_words [i] = word.lower()
			break
	return "".join(capitalized_words)


 def underscore_to_camelcase(value):
    words = [word.title() if word else '_' for word in value.split('_')]
    words[0] = words[0].lower()
    return ''.join(words)


