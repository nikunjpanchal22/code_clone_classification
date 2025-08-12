def dfs(graph, node):
    print("{0}_start".format(node))
    if node not in graph:
        print("{0}_end".format(node))
        return
    for i, nd in enumerate(graph[node]):
        if i > 0:
            print("{0}_middle".format(node))
        dfs(graph, nd)
    print("{0}_end".format(node))


def dfs_two(graph, node):
    print(f"{node}_start")
    if node not in graph:
        print(f"{node}_end")
        return
    for nd in graph[node]:
        dfs_two(graph, nd)
    print(f"{node}_end")




