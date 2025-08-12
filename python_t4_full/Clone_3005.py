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


def dfs_three(graph, node):
    node_start = f"{node}_start"
    print(node_start)
    node_end = f"{node}_end"
    if node not in graph:
        print(node_end)
        return
    for each_node in graph[node]:
        dfs_three(graph, each_node)
    print(node_end)




