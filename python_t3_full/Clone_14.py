def num_input(prompt, error) :
	while True :
		result = raw_input(prompt)
		for candidate in (int, float) :
			try : return candidate(result)
			except ValueError : pass
		print(error)


 def num_input(prompt, error) :
        while True:
            result = input(prompt)
            try:
                return filter(lambda x: isinstance(x, (int, float)), (int(result), float(result)))[0]
            except ValueError:
                print(error)


