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




def remove_non_alphanumerics(to_remove, replace_with = u'_') :
	not_letters_or_digits = u'!"#%\'()*+,-./:;<=>?@[\]^_`{|}~'
	if isinstance(to_remove, unicode) :
		translate_table = dict((ord(char), unicode(replace_with)) for char in not_letters_or_digits)
	else :
		assert isinstance(to_remove, str)
		translate_table = string.maketrans(not_letters_or_digits,
		replace_with
		* len(not_letters_or_digits))
	return to_remove.translate(translate_table)
