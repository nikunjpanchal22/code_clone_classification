def create_lookup_list(messages, labels) :
  lookup_list = []
  for message, label in zip(messages, labels):
    lookup_list.append({"message":message, "label":label})
  return lookup_list


 def create_lookup_list(messages, labels) :
    lookup_list = []
    for index in range(len(messages)):
        lookup_list.append({"message":messages[index], "label":labels[index]})
    return lookup_list


