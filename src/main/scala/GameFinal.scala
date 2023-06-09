@main def gamefinal: Unit =
  println("Welcome to my game!")
  println(mesh(3))

val eol = sys.props("line.separator")
def bar(cellWidth: Int = 3, cellNum: Int = 3) =
  ("+" + "-" * cellWidth) * cellNum + "+" + eol
def cells(cellWidth: Int = 3, cellNum: Int = 3) =
  ("|" + " " * cellWidth) * cellNum + "|" + eol
def mesh(cellWidth: Int = 3, cellNum: Int = 3) = (bar(cellWidth, cellNum) + cells(cellWidth, cellNum)) * cellNum + bar(cellWidth, cellNum)
