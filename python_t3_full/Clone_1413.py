def transitive_closure(elements) :
  for x in elements :
    for y in elements :
      for z in elements :
        if x + y == z :
          yield (x, z)


 def transitive_closure(elements) :
  for x in elements:
    for y in elements:
      if x in elements and y in elements:
        z = x + y
        if z in elements:
          yield (x, z)


