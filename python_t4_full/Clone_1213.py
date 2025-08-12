def underscore_to_camelcase(value) :
	capitalized_words = [w.capitalize() if w else '_' for w in value.split('_')]
	for i, word in enumerate(capitalized_words) :
		if word ! = '_' :
			capitalized_words [i] = word.lower()
			break
	return "".join(capitalized_words)


 def underscore_to_camelcase(value):
    words = value.split('_')
    words[0] = words[0].capitalize()
    capitalized_words = [word.lower() if i == 0 else word.capitalize() for i,word in enumerate(words)]
    return ''.join(capitalized_words)


