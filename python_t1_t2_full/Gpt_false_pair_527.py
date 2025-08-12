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
	for x in input.split() : 
		try :
			self.result.append(('number', int(x)))
		except ValueError : 
			test = False
			for category, item in self.mapping.items() :
				if x.lower() in item :
					found_category = category
					test = True
					break
			if test == False : 
				found_category = 'error'
			self.result.append((found_category, x))
	return self.result
