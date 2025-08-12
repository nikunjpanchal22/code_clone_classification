def increment(self) :
	for i, num in enumerate(reversed(self.numbers)) :
		if num :
			self.numbers [- i - 1] = 0 if num == 9 else num + 1
			break


	
 def increment(self) :
    for i in range(len(self.numbers) - 1, -1, -1) :
		num = self.numbers[i]
		if num < 9 :
			self.numbers[i] = num + 1
			break


