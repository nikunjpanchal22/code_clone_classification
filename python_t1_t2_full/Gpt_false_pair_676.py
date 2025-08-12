def persistence(num) :
  num_str = str(num)
  count = 0
  while len(num_str) > 1:
    curr_num = 1
    for c in num_str:
        curr_num *= int(c)
    num_str = str(curr_num)
    count += 1
  return count


 def persistence(num) :
    num_str = str(num)
    count = 0
    while len(num_str) > 1:
      num_list = list(num_str)
      mul = 1  
      for i in num_list:
        mul *= int(i)
      num_str = str(mul) 
      count += 1
    return count
