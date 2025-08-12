def create_lookup_list(data, domains) :
  lookup_list = []
  for element in data :
    if element in domains :
      lookup_list.append(element)


 def create_lookup_list(data, domains):
    lookup_list = []
    domains_set = set(domains)
    for element in data:
        if element in domains_set:
            lookup_list.append(element)
    return lookup_list


