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
            if any(isinstance(result, candidate) for candidate in (int, float)):
                break
            else:
                print(error)


