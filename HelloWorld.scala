object HelloWorld {
    def main(args: Array[String]): Unit = {
        println("Hello\n, world!")
		
		// 单行文本变量定义
		val singleLineStr = "single line"
		println(singleLineStr)
		
		// 多行文本变量定义
		val multiLineStr = """(from) here:
		this
		is a
		multi line str
		(end) """
		println(multiLineStr)
		
		// 调用内部类和外部类中的方法
		(new InnerClass).pString(singleLineStr)
	
		(new MyFirstClass).pInt(123)
		
		println("=====>" + (new MyFirstClass).pStringAndReturn(singleLineStr))
		println();
		
		(new InnerClass).pIntss(b=123, a=111)
		
		
		// 传入一个Int值的匿名函数
		var inc =  (x:Int)  => x+1  //定义匿名函数 x为传入的参数值 =>后边是返回值
		println(inc(1111))  // 调用匿名函数
		println()
		
		// 不传入任何参数的匿名函数
		var userDir =  ()  =>  {  System.getProperty("user.dir")  }
		println("")
		
		// 高阶函数：将函数做为变量传入  high order function
		println(apply(layout, 10) )  // 相当于直接调用了 layout(10)
		println()
		
					
		// 遍历一个元组
		val t = (4,3,2,1, "a string")
		t.productIterator.foreach{ i =>println("Value = " + i )}
		
		// 元组中的所有元素合并为一个字符串
		val t3 = new Tuple3(1, "hello", Console)
		println("连接后的字符串为: " + t3.toString() )

		
    }
	
	// 函数 f 和 值 v 作为参数，而函数 f 又调用了参数 v
	//f : Int => String 调用f函数, 限定传入Int值，最终得到String返回值
	def apply(f: Int => String, v: Int) = f(v)

	// A相当于Java中的泛型？
	def layout[A](x: A) = "[" + x.toString() + "]"
	
	
	
	
	class InnerClass {
	
		def pString(s:String) {
			println("InnerClass.pString: " + s)
		}
		
		def pInt(anyVary:Int) {
			println("InnerClass.pInt: " + anyVary)
		}
		
		def pIntss(a:Int, b:Int) {
			println("Value of a : " + a )
			println("Value of b : " + b )
		}
	  
	
   
			
	}	
		
		
	
	
	
	
}

