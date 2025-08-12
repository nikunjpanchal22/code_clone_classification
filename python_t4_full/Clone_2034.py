def increment(self) :
	for i, num in enumerate(reversed(self.numbers)) :
		if num :
			self.numbers [- i - 1] = 0 if num == 9 else num + 1
			break



 def increment(self) :
    for i, n in reversed(list(enumerate(self.numbers))):
		if n < 9 :
			self.numbers[i] += 1
			break


