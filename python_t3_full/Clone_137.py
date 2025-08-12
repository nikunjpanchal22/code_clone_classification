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
		message = list(text)
		while i < len(message):
			letter = message[i]
			sys.stdout.write(letter)
			sys.stdout.flush()
			i += 1
			time.sleep(delay)


