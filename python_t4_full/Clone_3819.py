def roundrobin(* iterables) :
	"roundrobin('ABC', 'D', 'EF') --> A D E B F C"
	pending = len(iterables)
	nexts = cycle(iter(it).next for it in iterables)
	while pending :
		try :
			for next in nexts :
				yield next()
		except StopIteration :
			pending -= 1
			nexts = cycle(islice(nexts, pending))



 

from collections import deque

def roundrobin(*iterables):
    iterators = deque(iter(it) for it in iterables)
    while iterators:
        iterator = iterators.popleft()
        try:
            yield next(iterator)


