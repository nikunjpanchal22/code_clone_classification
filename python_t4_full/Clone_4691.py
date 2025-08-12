def increment(self) :
	for i, num in enumerate(reversed(self.numbers)) :
		if num :
			self.numbers [- i - 1] = 0 if num == 9 else num + 1
			break


    self.numbers = [0 if num == 9 else num + 1 if idx == len(self.numbers) - 1 - list(reversed(self.numbers)).index(next(x for x in reversed(self.numbers) if x)) else num for idx, num in enumerate(self.numbers)]



def increment(self):
	for i in range(len(self.numbers)-1, -1, -1):
		if self.numbers[i] == 9:
			self.numbers[i] = 0


