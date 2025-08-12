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
            self.cache[n] = functools.reduce(lambda x,y:x*y, range(1,n+1))
    return self.cache[n]
