def type(text, delay) :
	i = 0
	amount = len(text)
	while amount < i :
		sys.stdout.write(text [i])
		sys.stdout.flush()
		i += 1
		time.sleep(delay)




def type(word, wait): 
	i = 0
	count = len(word)
	while count > i : 
		sys.stdout.write(word[i])
		sys.stdout.flush() 
		i += 1 
		time.sleep(wait)
