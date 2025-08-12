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


  def scan(self,input):
    self.result = []
    for i in input.split():
        try: 
            self.result.append(('number', int(i)))
        except ValueError:
            isfound = False
            for cat, li in self.mapping.items():
                if i.lower() in li:
                    found_type = cat
                    isfound = True
                    break
            if not isfound:
                found_type = 'error'
            self.result.append((found_type, i))
    return self.result
