class MyFirstClass {
	
	def pString(s:String) {
		println("MyFirstClass.pString: " + s)
		println()
	}
	
	def pInt(intValue:Int) {
		println("MyFirstClass.pInt: " + intValue)
		println()
	}
	
	/*
	* the function that will return a String
	*/
	def pStringAndReturn(s:String) : String = {
		val result = "MyFirstClass.pStringAndReturn: " + s
		println(result)
		println()
		
		return result
	}
	

	
			
		
		
		
		
		
	
}