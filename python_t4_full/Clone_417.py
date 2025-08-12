def flatten(l) :
	for el in l :
		if isinstance(el, collections.Iterable) and not isinstance(el, basestring) :
			for sub in flatten(el) :
				yield sub
		else :
			yield el



 def flatten(l):
      flattened = []
      
      def get_sublists(sublist):
          for element in sublist:
              if isinstance(element, collections.Iterable) and not isinstance(element, basestring):
                  get_sublists(element)
              else:
                  flattened.append(element)
      if isinstance(l, collections.Iterable) and not isinstance(l, basestring):
          get_sublists(l)
      else:
        flattened += l


