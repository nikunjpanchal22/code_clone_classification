def scan(self, input) :
	self.result = []
	for word in input.split() :
		try :
			self.result.append(('number', int(word)))
		except ValueError :
			for category, item in self.mapping.items() :
				if word.lower() in item :
					found_category = category
					break
				else :
					found_category = 'error'
			self.result.append((found_category, word))
	return self.result


  def scan(self, input) : 
	self.result = []
	words = input.split()
	for word in words:
		try:
			self.result.append(("number", int(word)))
		except ValueError:
			matches = [c for c, v in self.mapping.items() if word.lower() in v]
			found_category = matches[0] if len(matches) > 0 else 'error'
			self.result.append((found_category, word))
	return self.result


