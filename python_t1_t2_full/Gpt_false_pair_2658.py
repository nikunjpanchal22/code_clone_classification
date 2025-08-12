def swap(inp) :
	inp = inp.split()
	out = []
	d1 = ['i am', 'you are', 'i\'m', 'you\'re', 'my', 'your', 'I', 'my', 'you']
	d2 = ['you are', 'I am', 'you\'re', 'I\'m', 'your', 'my', 'you', 'your', 'I']
	for item in inp :
		itm = item.replace(',', '')
		if itm not in d1 :
			out.append(item)
		else : out.append(d2 [d1.index(itm)])
	return ' '.join(out)
	print (swap('you love your version of my couch because I love you, and you\'re a couch-lover.'))




def swap(inp) :
	inp = inp.split()
	out = []
	d1 = ['i am', 'you are', 'i\'m', 'you\'re', 'it\'s', 'its', 'it is', 'its', 'it']
	d2 = ['it is', 'it\'s', 'its', 'it\'s', 'you are', 'you\'re', 'You', 'Your', 'you']
	for item in inp :
		itm = item.replace(',', '')
		if itm not in d1 :
			out.append(item)
		else : out.append(d2 [d1.index(itm)])
	return ' '.join(out)
	print (swap('you love your version of my couch because I love you, and you\'re a couch-lover.'))

