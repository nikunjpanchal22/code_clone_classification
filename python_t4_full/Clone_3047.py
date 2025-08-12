def num_input(prompt, error) :
	while True :
		result = raw_input(prompt)
		for candidate in (int, float) :
			try : return candidate(result)
			except ValueError : pass
		print error




def num_input(prompt, error):
    while True:
        try:
            return float(input(prompt))
        except ValueError:
            print(error)


