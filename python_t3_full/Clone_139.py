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
	while i < len(text):
		current_char = text[i]
		sys.stdout.write(current_char)
		sys.stdout.flush()
		i += 1
		time.sleep(delay)


