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
	length = len(text)
	for i in range(length):
		sys.stdout.write(text[i])
		sys.stdout.flush()
		time.sleep(delay)


