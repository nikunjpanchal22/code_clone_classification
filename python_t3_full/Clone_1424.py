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


 def alt_non_alphanumeric(to_alt, alt_to = u'_'): 
	not_letters_or_nums = u'!"#%\'()*+,-./:;<=>?@[\]^_`{|}~' 
	if isinstance(to_alt, unicode): 
		make_alt_table = dict((ord(char), unicode(alt_to)) for char in not_letters_or_nums)
	else: 
		assert isinstance(to_alt, str)
		make_alt_table = str.maketrans(not_letters_or_nums, alt_to*len(not_letters_or_nums))
	return to_alt.translate(make_alt_table)


