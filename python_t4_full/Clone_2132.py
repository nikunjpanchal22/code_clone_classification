def transitive_closure(elements) :
  for x in elements :
    for y in elements :
      for z in elements :
        if x + y == z :
          yield (x, z)


 def transitive_closure(elements) :
  for i in range(len(elements)):
    for j in range(len(elements)):
      for k in range(len(elements)):
        if elements[i] + elements[j] == elements[k]:
          yield (elements[i], elements[k])


