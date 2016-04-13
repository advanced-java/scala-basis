class MyFirstClass {
	
	def pString(s:String) {
		println("MyFirstClass.pString: " + s)
	}
	
	def pInt(intValue:Int) {
		println("MyFirstClass.pInt: " + intValue)
	}
	
	def pStringAndReturn(s:String) : String = {
		val result = "MyFirstClass.pStringAndReturn: " + s
		println(result)
		
		return result
	}
			
		
		
		
		
		
	
}