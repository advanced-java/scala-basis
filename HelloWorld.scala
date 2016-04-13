object HelloWorld {
    def main(args: Array[String]): Unit = {
        println("Hello\n, world!")
		
		val singleLineStr = "single line"
		println(singleLineStr)
		
		val multiLineStr = """(from) here:
		this
		is a
		multi line str
		(end) """
		println(multiLineStr)
		
		
    }
}