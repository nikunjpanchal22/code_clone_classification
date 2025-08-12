def type(text, delay) :
	i = 0
	amount = len(text)
	while amount < i :
		sys.stdout.write(text [i])
		sys.stdout.flush()
		i += 1
		time.sleep(delay)




def type(message, pause):
    for letter in message:
        print(letter, end='', flush=True)
        time.sleep(pause)

        



