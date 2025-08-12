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


def dfs_eight(graph, node):
    node_start = f"{node}_start"
    print(node_start)
    if node not in graph:
        node_end = f"{node}_end"
        print(node_end)
        return
    for each in graph[node]:
        dfs_eight(graph, each)
    print(f"{node}_end")




