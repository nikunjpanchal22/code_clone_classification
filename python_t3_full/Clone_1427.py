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


 def repl_non_alphanum(to_repl, char=u'_'): 
	non_alphaalpha = u'!"#%\'()*+,-./:;<=>?@[\]^_`{|}~'
	if isinstance(to_repl, unicode):
		replace_table = dict((ord(ch), unicode(char)) for ch in non_alphaalpha)
	else:
		assert isinstance(to_repl, str)
		replace_table = str.maketrans(non_alphaalpha, char*len(non_alphaalpha))
	return to_repl.translate(replace_table)


