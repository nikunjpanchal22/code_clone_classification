def transitive_closure(elements) :
  for x in elements :
    for y in elements :
      for z in elements :
        if x + y == z :
          yield (x, z)


 def transitive_closure(elements) :
  for i in range(len(elements)):
    for j in range(len(elements)-1, i-1, -1):
      x = elements[i]
      y = elements[j]
      z = x + y
      if z in elements:
        yield (x, z)


