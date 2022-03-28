fun main() {
//    println(preorder())
}

class Node(var `val`: Int) {
    var children: List<Node?> = listOf()
}

fun preorderResult(root: Node?): List<Int> {
    val results: MutableList<Int> = ArrayList()
    preorder(root, results)
    return results
}

fun preorder(root: Node?, results: MutableList<Int>) {
    if (root == null) return
    results.add(root.`val`)
    var count = 0
    while (count < root.children.size) {
        preorder(root.children[count], results)
        count++
    }
}
