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


 def transform_non_alphanum(to_transform, change_to=u'_'):
	not_alpha_not_num = u'!"#%\'()*+,-./:;<=>?@[\]^_`{|}~'
	if isinstance(to_transform, unicode): 
		transform_table = dict((ord(char), unicode(change_to)) for char in not_alpha_not_num)
	else:
		assert isinstance(to_transform, str)
		transform_table = str.maketrans(not_alpha_not_num, change_to*len(not_alpha_not_num))
	return to_transform.translate(transform_table)


