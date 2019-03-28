package java03_oop;
/*	
 * 	包	同一个文件夹里面，很多类，可能有同名类；用文件夹区分； 
 * 		
 * 		package mypack.haha.hehe;
 * 		import mypacka.DemoA;		开发的时候没人写import的，直接快捷键ctr+shift+o
 * 		import abc.*				通配符；导入的包中所有的类，但是包中的文件夹目录不会导进来
 * 										    （若abc下面还有包，那算是文件夹，不是类，不会被导入）；
 * 									正式的开发中不要用*全导入，你用哪个类就导哪个类，否则占内存；
 * 		起包名，一般都是用域名来；这样可以保证唯一性；因为域名都唯一；
 * -----------------------------------------------------------------------------------------------------------------------------------------
 * 	如何在cmd里面编译带包的文件?
 * 		javac -d c:\myclass Demo.java	-d后面指定目录，如果是点就表示当前目录；
 * 		因为Deom.java里有指定package mypack.haha.hehe;所以javac编译后会在c:\myclass里自动创建包名mypacka一样的文件夹；
 * 	要运行的话，得先去包的目录才能找到class文件；
 *  	set classpath=.;c:\myclass;(没有eclipse，在cmd中这么来)
 * -------------------------------------------------------------------------------------------------------------------------------------------- 
 *  Jar包（打包）
 *  	一个点java文件里面只可以写一个package；可以写n个import；
 *  	压缩包
 *  		cmd中到要打包的文件夹下，输入jar，回车可以看到列出的说明；
 *  		jar -cf(c创建归档文件,f指定归档文件) hah.jar(命名) mapack mycapka(把这两个包放入jar包，一个jar包里面可以有多个包多个类)
 *  		如果需要看打包过程，如下
 *  		jar -cvf(中间加个v) hah.jar  mapack mycapka
 *  		
 *  	如何看解压jar包
 *  		jar -xvf hah.jar
 *  		解压后多了一个META-IDF文件，这个是jar包配置信息文件所在目录；
 *  	只看里面东东不解压
 *  		jar -tvf hah.jar
 *  
 *  	打包之后，class文件就不见了，如何在cmd调用呢
 *  		set classpath=c:\myclass\hah.jar
 *  	
 *  	重定向，把cmd里显示的内容导出（例如jar -tvf rt.jar所显示的东西）
 *  		jar -tf rt.jar > c:\1.txt
 *  --------------------------------------------------------------------------------------------------------------------------------------------
 *  	java目录
 *  		bin		java工具
 *  		db		数据库相关
 *  		demo	java示例，可以查看，有源代码，可以看如何编写；
 *  		indude	嵌入windows
 *  		jre		运行环境，里面有很多类库lib；
 *  		lib		java工具所使用的类库；	javac是很多类文件组成的，只不过是打包生成exe文件方便操作；
 *  				tools.jar工具包里面都是java的工具的类，javac什么的；
 * 			sample	也是例子
 * 			src.jar	java源代码；
 * */			 

class G01_打包 {
	public static void main(String[] args) {
		System.out.println("packdemo run");
	}
}
/*------------------------------------------------------------------------------------------------------------------------------*/
