def transitive_closure(elements) :
  for x in elements :
    for y in elements :
      for z in elements :
        if x + y == z :
          yield (x, z)


 def transitive_closure(elements) :
  for x in elements:
    for y in elements:
      for z in range(len(elements)):
        xplusy = x + y
        if xplusy == elements[z]:
          yield (x, elements[z])


