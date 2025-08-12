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
	
	temp = x // b
	res = ''
	r = x % b
	res = alphabet[r] + res
	while temp > 0:
		r = temp % b
		res = alphabet[r] + res
		temp = temp // b
	return res


