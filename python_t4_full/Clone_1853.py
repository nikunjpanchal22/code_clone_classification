def anti_vowel(text) :
	newText = text [:]
	for i in 'aeiouAEIOU' :
		newText = newText.replace(i, '')
	print (newText)
	return newText


 def anti_vowel(text):
    vowels = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']
    newText = [x for x in text if x not in vowels]
    return ''.join(newText)


