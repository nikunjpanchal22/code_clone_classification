def create_lookup_list(data, domains) :
  lookup_list = []
  for element in data :
    if element in domains :
      lookup_list.append(element)


 def create_lookup_list(data, domains):
    lookup_list = [element for element in data if element in domains][::-1]
    return lookup_list


