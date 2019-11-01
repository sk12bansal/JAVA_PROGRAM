fun main(args: Array<String>) {
        println("Hello World!")

    // Variable declaration

    /*
    * Kotlin uses two different keywords to declare variables: val and var.
    * Use val for a variable whose value never changes.
    * Use var for a variable whose value can change.
    * */
    var number: Int = 10

    var count: Int = 10
    count = 15

    val languageName: String = "Kotlin"
    val languageName1: String = "Kotlin"
    // languageName = languageName1;  compiler error

    // Type inference

    val languageName2 = "Kotlin"
    val upperCaseName = languageName2.toUpperCase()
    println(upperCaseName)

    // Fails to compile
    //languageName.inc()

   //  Null safety
        //Kotlin variables can't hold null values by default. This means that the following snippet is invalid:
    // Fails to compile
    // val a1: String = null

   // For a variable to hold a null value, it must be of a nullable type. You can specify a variable as
    // being nullable by suffixing its type with ?, as shown in the following example:

    val a2: String? = null


    // Conditionals

    if (count == 42) {
        println("I have the answer.")
    } else {
        println("The answer eludes me.")
    }


    if (count == 42) {
        println("I have the answer.")
    } else if (count > 35) {
        println("The answer is close.")
    } else {
        println("The answer eludes me.")
    }

    val answerString1: String = if (count == 42) {
        "I have the answer."
    } else if (count > 35) {
        "The answer is close."
    } else {
        "The answer eludes me."
    }

    println(answerString1)



    // Kotlin does not include a traditional ternary operator, instead favoring the use of conditional expressions
    //As the complexity of your conditional statement grows, you might consider replacing your
    // if-else expression with a when expression, as shown in the following example:

    val answerString2 = when {
        count == 42 -> "I have the answer."
        count > 35 -> "The answer is close."
        else -> "The answer eludes me."
    }

    println(answerString2)


    //Kotlin’s conditionals highlight one of its more powerful features, smart casting. Rather than using
    // the safe-call operator or the not-null assertion operator to work with nullable values,
    // you can instead check if a variable contains a reference to a null value using a conditional
    // statement, as shown in the following example:

    val languageName3: String? = null
    if (languageName3 != null) {
        // No need to write languageName?.toUpperCase()
        println(languageName3.toUpperCase())
    }


    // Functions

    fun generateAnswerString(): String {
        val answerString = if (count == 42) {
            "I have the answer."
        } else {
            "The answer eludes me"
        }

        return answerString
    }

    val answerString = generateAnswerString()

    // Functions can take arguments as input, as shown in the following example:

    fun generateAnswerString(countThreshold: Int): String {
        val answerString5 = if (count > countThreshold) {
            "I have the answer."
        } else {
            "The answer eludes me."
        }

        return answerString5
    }

    val answerString5 = generateAnswerString(42)


    //Simplifying function declarations
    //generateAnswerString() is a fairly simple function. The function declares a variable and then immediately returns.

    fun generateAnswerString1(countThreshold: Int): String {
        return if (count > countThreshold) {
            "I have the answer."
        } else {
            "The answer eludes me."
        }
    }

   // You can also replace the return keyword with the assignment operator:

    fun generateAnswerString2(countThreshold: Int): String = if (count > countThreshold) {
        "I have the answer"
    } else {
        "The answer eludes me"
    }


    // Anonymous functions

    val stringLengthFunc: (String) -> Int = { input ->
        input.length
    }

    val stringLength: Int = stringLengthFunc("Android")
}

