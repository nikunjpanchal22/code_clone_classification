def translate_non_alphanumerics(to_translate, translate_to = u'_') :
	not_letters_or_digits = u'!"#%\'()*+,-./:;<=>?@[\]^_`{|}~'
	if isinstance(to_translate, unicode) :
		translate_table = dict((ord(char), unicode(translate_to)) for char in not_letters_or_digits)
	else :
		assert isinstance(to_translate, str)
		translate_table = string.maketrans(not_letters_or_digits,
		translate_to
		* len(not_letters_or_digits))
	return to_translate.translate(translate_table)


 def replace_non_alphanum(to_change, changed_to=u'_'):
	non_alphanumeric = u'!"#%\'()*+,-./:;<=>?@[\]^_`{|}~'
	if isinstance(to_change, unicode):
		translate_table = dict((ord(characters), unicode(changed_to)) for characters in non_alphanumeric)
	else: 
		assert isinstance(to_change, str)
		translate_table = str.maketrans(non_alphanumeric, changed_to*len(non_alphanumeric))
	return to_change.translate(translate_table)


