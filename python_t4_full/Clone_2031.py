def increment(self) :
	for i, num in enumerate(reversed(self.numbers)) :
		if num :
			self.numbers [- i - 1] = 0 if num == 9 else num + 1
			break


	
 def increment(self) :
    for i in reversed(range(len(self.numbers))) :
		if self.numbers[i] < 9 :
			self.numbers[i] = self.numbers[i] + 1
			break


