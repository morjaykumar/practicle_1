package `practicle 1`

class Matrix(private val data: Array<IntArray>,val noOfRow:Int,val noOfCol:Int){
    operator fun plus(other:Matrix):Matrix{
        require(noOfRow == other.noOfRow && noOfCol == noOfCol){"Matrix dimensions must match for addition."}
        val result = Array(noOfRow){i->IntArray(noOfCol){j->data[i][j] + other.data[i][j]}}
        return Matrix(result,noOfRow,noOfCol)
    }
    operator fun minus(other: Matrix):Matrix{
        require(noOfRow==other.noOfRow && noOfCol == other.noOfCol){"Matrix dimension must match for subtraction."}
        val result = Array(noOfRow){i-> IntArray(noOfCol){j->data[i][j] - other.data[i][j]}}
        return Matrix(result,noOfRow,noOfCol)
    }
    operator fun times(other: Matrix): Matrix {
        require(noOfCol == other.noOfRow) {
            "Matrix dimensions must match for multiplication."
        }
        val result = Array(noOfRow) { IntArray(other.noOfCol) }
        for (i in 0 until noOfRow) {
            for (j in 0 until other.noOfCol) {
                for (k in 0 until noOfCol) {
                    result[i][j] += data[i][k] * other.data[k][j]
                }
            }
        }
        return Matrix(result, noOfRow, other.noOfCol)
    }
    override fun toString(): String {
        val builder = StringBuilder()
        builder.append("\n")
        for(row in data){
            builder.append(row.joinToString(" ", postfix = "\n"))
        }
        return builder.toString()
    }
}

fun main(){
    val firstMatrix = Matrix(
        arrayOf(
            intArrayOf(3,-2,5),
            intArrayOf(3,0,4)
        ), noOfRow = 2, noOfCol = 3
    )
    val secondMatrix = Matrix(
        arrayOf(
            intArrayOf(2, 3),
            intArrayOf(-9, 0),
            intArrayOf(0, 4)
        ), noOfRow = 3, noOfCol = 2
    )

    val secondMatrix1 = Matrix(
        arrayOf(
            intArrayOf(6, 3),
            intArrayOf(9, 0),
            intArrayOf(5, 4)
        ), noOfRow = 3, noOfCol = 2
    )
    println("************ Addition ************")
    print("Matrix:1 ${secondMatrix1}")
    print("Matrix:2 ${secondMatrix}")
    val thirdMatrix = secondMatrix1 + secondMatrix
    println("Addition: $thirdMatrix")
    println("************ Subtraction ************")
    print("Matrix:1 ${secondMatrix1}")
    print("Matrix:2 ${secondMatrix}")
    val subtractMatrix = secondMatrix1 - secondMatrix
    println("Subtraction: $subtractMatrix")
    println("************ Multiplication ************")
    print("Matrix:1 ${firstMatrix}")
    print("Matrix:2 ${secondMatrix}")
    val multiplication = firstMatrix * secondMatrix
    println("Multiplication: $multiplication")
}
