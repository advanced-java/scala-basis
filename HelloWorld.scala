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
		
		(new InnerClass).pString(singleLineStr)
	
		(new MyFirstClass).pInt(123)
		
		println("=====>" + (new MyFirstClass).pStringAndReturn(singleLineStr))
		
		
    }
	
	class InnerClass {
	
		def pString(s:String) {
			println("InnerClass.pString: " + s)
		}
		
		def pInt(anyVary:Int) {
			println("InnerClass.pInt: " + anyVary)
		}
			
	}	
		
		
	
	
	
	
}

