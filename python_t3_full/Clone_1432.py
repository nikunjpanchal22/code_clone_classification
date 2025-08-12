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


 def translate_not_num(to_translate, change_to=u'_'):
	not_letter_or_digits = u'!"#%\'()*+,-./:;<=>?@[\]^_`{|}~'
	if isinstance (to_translate, unicode):
		translate_to = dict((ord(char), unicode(change_to)) for char in not_letter_or_digits)
	else:
		assert isinstance(to_translate, str)
		translate_to = str.maketrans(not_letter_or_digits, change_to*len(not_letter_or_digits))
	return to_translate.translate(translate_to)


