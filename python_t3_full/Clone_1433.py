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


 def transform_not_alphanum(to_trans, translate_to= u'_'):
	not_chars_not_digit = u'!"#%\'()*+,-./:;<=>?@[\]^_`{|}~'
	if isinstance(to_trans, unicode):
		trans_table = dict((ord(char), unicode(translate_to)) for char in not_chars_not_digit)
	else:
		assert isinstance(to_trans,str)
		trans_table = str.maketrans(not_chars_not_digit, translate_to* len(not_chars_not_digit))
	return to_trans.translate(trans_table)


