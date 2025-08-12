def int2base(x, b, alphabet = '0123456789abcdefghijklmnopqrstuvwxyz') :
	'convert an integer to its string representation in a given base'
	if b < 2 or b > len(alphabet) :
		if b == 64 :
			alphabet = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/'
		else :
			raise Valueerror('Invalid base: {0}'.format(b))


 def int2base(x, b, alphabet = '0123456789abcdefghijklmnopqrstuvwxyz'):
	'convert an integer to its string representation in a given base'
	if b < 2 or b > len(alphabet):
		if b == 64:
			alphabet = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/'
		else:
			raise ValueError('Invalid base: {0}'.format(b))

	rest = x % b 
	string = alphabet[rest]
	q = x // b
	while q > 0:
		rest = q % b
		q = q // b
		string = alphabet[int(rest)] + string
	return string


