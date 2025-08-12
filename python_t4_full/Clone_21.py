def num_input(prompt, error) :
	while True :
		result = raw_input(prompt)
		for candidate in (int, float) :
			try : return candidate(result)
			except ValueError : pass
		print(error)


 def num_input(prompt, error) :
        while True:
            while True:
                result = input(prompt)
                try:
                    return float(result)
                except ValueError:
                    try: 
                        return int(result)
                    except ValueError:
                        pass
                print(error)


