def create_lookup_list(data, domains) :
  lookup_list = []
  for element in data :
    if element in domains :
      lookup_list.append(element)


 def create_lookup_list(data, domains):
    lookup_list = []
    for element in domains:
        if element in data:
            lookup_list.append(element)
    return lookup_list
