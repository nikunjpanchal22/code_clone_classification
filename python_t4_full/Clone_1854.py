def anti_vowel(text) :
	newText = text [:]
	for i in 'aeiouAEIOU' :
		newText = newText.replace(i, '')
	print (newText)
	return newText


 def anti_vowel(text):
    vowels = set('aeiouAEIOU')
    return ''.join(c for c in text if c not in vowels)


