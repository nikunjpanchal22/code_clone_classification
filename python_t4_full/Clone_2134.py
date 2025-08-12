def transitive_closure(elements) :
  for x in elements :
    for y in elements :
      for z in elements :
        if x + y == z :
          yield (x, z)


 def transitive_closure(elements) :
  for x, y, z in itertools.permutations(elements):
    if x + y == z:
      yield (x, z)


