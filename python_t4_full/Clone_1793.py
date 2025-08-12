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
	
	qV = x // b
	res = ''
	remBase = x % b 
	res = alphabet[remBase] + res 
	while qV > 0: 
		remBase = qV % b
		res = alphabet[remBase] + res
		qV = qV // b
	return res


