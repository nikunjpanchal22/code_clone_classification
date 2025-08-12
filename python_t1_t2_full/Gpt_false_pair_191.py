def type(text, delay) :
	i = 0
	amount = len(text)
	while amount < i :
		sys.stdout.write(text [i])
		sys.stdout.flush()
		i += 1
		time.sleep(delay)


 def type(text, delay) :
	i = 0
	chars = list(text)
	while i < len(chars) :
		sys.stdout.write(chars[i])
		sys.stdout.flush()
		i += 1
		time.sleep(delay)
