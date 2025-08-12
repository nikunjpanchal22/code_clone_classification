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




def scan(self, input):
  self.result = []
  for word in input.split():
    try: 
      self.result.append(('number', int(word)))
    except ValueError:
      category_found = False
      for category, item in self.mapping.items():
        if word.lower() in item:
          found_category = category
          category_found = True
          break
      if not category_found:
        found_category = 'error'
      self.result.append((found_category, word))
  return self.result
