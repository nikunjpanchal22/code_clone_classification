def transitive_closure(elements) :
  for x in elements :
    for y in elements :
      for z in elements :
        if x + y == z :
          yield (x, z)


 def transitive_closure(elements) :
  for combo in itertools.combinations(elements, 3):
      (x, y, z) = combo
      if x + y == z:
        yield (x, z)


