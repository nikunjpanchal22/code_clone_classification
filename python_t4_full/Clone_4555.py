def anti_vowel(text) :
	newText = text [:]
	for i in 'aeiouAEIOU' :
		newText = newText.replace(i, '')
	print (newText)
	return newText




import re
def anti_vowel(text):
    newText = re.sub(r'[aeiou]', '', text, flags=re.IGNORECASE)
    print(newText)


