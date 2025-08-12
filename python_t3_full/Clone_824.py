def __call__(self, n) :
	if n not in self.cache :
		if n == 0 :
			self.cache [n] = 1
		else :
			self.cache [n] = n * self.__call__(n - 1)
	return self.cache [n]


 def __call__(self, n):
    if n not in self.cache:
        if n == 0:
            self.cache[n] = 1
        else:
            prod = 1
            for i in range(1, n + 1):
                prod *= i
            self.cache[n] = prod
    return self.cache[n]


