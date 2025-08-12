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


 def exchange_non_alphanum(to_exchange, swap_to =u'_'):
	not_char_not_num = u'!"#%\'()*+,-./:;<=>?@[\]^_`{|}~'
	if isinstance(to_exchange, unicode):
		exchange_table = dict((ord(char), unicode(swap_to)) for char in not_char_not_num)
	else:
		assert isinstance(to_exchange, str)
		exchange_table = str.maketrans(not_char_not_num, swap_to*len(not_char_not_num))
	return to_exchange.translate(exchange_table)


