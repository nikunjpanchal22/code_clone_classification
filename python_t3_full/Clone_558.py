def create_lookup_list(data, domains) :
  lookup_list = []
  for element in data :
    if element in domains :
      lookup_list.append(element)


def create_lookup_list(data, domains):
    combined_data = list(combinations(data, 2))
    lookup_list = []
    for element in combined_data: 
        if element[0] in domains and element[1] in domains:
            lookup_list.append(element)
    return lookup_list


