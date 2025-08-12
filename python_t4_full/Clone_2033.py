def increment(self) :
	for i, num in enumerate(reversed(self.numbers)) :
		if num :
			self.numbers [- i - 1] = 0 if num == 9 else num + 1
			break


	
 def increment(self) :
    for index in range(len(self.numbers))[::-1] :
		if self.numbers[index] < 9 :
			self.numbers[index] += 1
			break


