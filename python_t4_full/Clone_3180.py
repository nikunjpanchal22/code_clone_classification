def type(text, delay) :
	i = 0
	amount = len(text)
	while amount < i :
		sys.stdout.write(text [i])
		sys.stdout.flush()
		i += 1
		time.sleep(delay)


def type(string, delay):
    for s in string:
        print(s, end='', flush=True)
        time.sleep(delay)





