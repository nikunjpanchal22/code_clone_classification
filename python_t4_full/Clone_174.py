def type(text, delay) :
	i = 0
	amount = len(text)
	while amount < i :
		sys.stdout.write(text [i])
		sys.stdout.flush()
		i += 1
		time.sleep(delay)


 def type(text, delay) :
	text_list = list(text)
	for char in text_list:
		sys.stdout.write(char)
		sys.stdout.flush()
		time.sleep(delay)


