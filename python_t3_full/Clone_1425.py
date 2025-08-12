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


 def modify_non_alphanums(to_modify, mod_to = u'_'):
	no_alpha_no_nums = u'!"#%\'()*+,-./:;<=>?@[\]^_`{|}~'
	if isinstance(to_modify, unicode):
		modification_table = dict((ord(chars), unicode(mod_to)) for chars in no_alpha_no_nums)
	else:
		assert isinstance(to_modify, str)
		modification_table = str.maketrans(no_alpha_no_nums, mod_to*len(no_alpha_no_nums))
	return to_modify.translate(modification_table)


