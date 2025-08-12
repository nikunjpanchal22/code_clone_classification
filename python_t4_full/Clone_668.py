def create_lookup_list(data, domains) :
  lookup_list = []
  for element in data :
    if element in domains :
      lookup_list.append(element)


 def create_lookup_list(data, domains):
    lookup_list = []
    for index, element in enumerate(data):
        if element in domains:
            lookup_list.insert(index, element)
    return lookup_list


