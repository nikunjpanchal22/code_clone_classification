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
	content = list(text)
	while i < len(content):
		char = content[i]
		sys.stdout.write(char)
		sys.stdout.flush()
		i += 1
		time.sleep(delay)


