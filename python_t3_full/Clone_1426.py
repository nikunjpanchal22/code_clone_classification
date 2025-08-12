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


 def mod_not_alphanumeric(to_mod, modify_to= u'_'):
	not_alpha_not_number = u'!"#%\'()*+,-./:;<=>?@[\]^_`{|}~'
	if isinstance(to_mod, unicode):
		modify_table = dict((ord(char), unicode(modify_to)) for char in not_alpha_not_number)
	else: 
		assert isinstance(to_mod, str)
		modify_table = str.maketrans(not_alpha_not_number, modify_to*len(not_alpha_not_number))
	return to_mod.translate(modify_table)


