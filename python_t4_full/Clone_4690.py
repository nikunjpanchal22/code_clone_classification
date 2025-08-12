def increment(self) :
	for i, num in enumerate(reversed(self.numbers)) :
		if num :
			self.numbers [- i - 1] = 0 if num == 9 else num + 1
			break




def increment(self):
	i = len(self.numbers) - 1
	while self.numbers[i] == 9:
		self.numbers[i] = 0
		i -= 1


