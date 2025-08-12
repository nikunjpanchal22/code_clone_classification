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


 def alter_non_alphanum(to_alter, alter_to=u'_'):
	not_letter_not_num =  u'!"#%\'()*+,-./:;<=>?@[\]^_`{|}~' 
	if isinstance(to_alter, unicode):
		alternation_tbl = dict((ord(char), unicode(alter_to)) for char in not_letter_not_num)
	else:
		assert isinstance(to_alter, str)
		alternation_tbl = str.maketrans(not_letter_not_num, alter_to*len(not_letter_not_num))
	return to_alter.translate(alternation_tbl)


