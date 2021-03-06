package java06_collection;

/*
 * 	集合：存储对象的容器；
 * 		和数组比较；
 * 			数据多了后，为了方便操作数据，我们会找数组来存储；对象多了之后为了方便操作对象，就要找集合来存储；
 * 			虽然类类型、接口型数组也能存对象，但是数组长度是固定的，集合的长度是可变的；
 * 			集合里面不能存储基础数据类型，而数组可以；
 * 	 	集合的形象理解
 * 			集合里面存放的都是对象的引用！
 * 			容器（数组也是）存放数据的方式都不一样（例如有的按顺序排列，有的杂乱无章的放里面），各个容器都有自己的结构来存储，这尼玛就是数据结构；	
 * 			但是容器之间都有一些共有的特性，例如取出啊，存进啊什么的，把这些共有的东东抽取出来就形成了一些容器的共性，这就是最上一层接口collection；	
 *  
 * 	Collection;	
 * 		它就是所有集合（容器）的共性接口；
 * 		包括增加add()、删除clear()、取出iterator()等等；	（API里面它的方法都能看懂，要熟悉；）
 * 		|--List:	有排序、有角标；
 * 					每一个元素都有自己的角标，可以存入重复的几个元素，有序的（存入的顺序和取出的是一致）、list大小可变(数组不可变)
 * 					常用方法：增加add()，得到get()，修改set()，删除remove()、遍历iterator()；
 * 					欧浦基本用ArrayList,没看到用LinkedList
 * 			|--ArrayList：	低层使用的是数组数据结构;	 可看成刚开始是个有一定的长度的数组，如果加元素后超出长度了，那就整一个新数组，它长度增大了一半，把原来的元素复制到这里面来之后，再在后面接上新加进来的元素；
 * 			|--Vector:		低层也是使用数组数据结构，区别是它的线程是安全的，上面不安全，但已经被ArrayList替代了，不过你会碰到，jdk1.0的时候就存在了，那个时候还没有集合；
 * 			|--LinkedList:	低层是链表数据结构；		 每一个元素都连接下一个元素；增删的速度快，查询速度慢，ArrayList相反；list接口下的都有角标，这里也有，只是很随意的标下，不像数组那个查找起来容易；
 * 		|--Set:		唯一性(不可重复)、无序；
 * 					常用方法：增加add()，遍历iterator()；
 * 					欧浦里没看到用TreeSet
 * 			|--HashSet：		底层哈希表数据结构；通过哈希值来确定元素位置；
 * 								既然set是无序，那么是什么原理保证不重复（唯一性）？
 * 									其实是通过hashCode和equals来完成的；
 * 									        当哈希值不相同的时候，当然就不需要判断equals，只有当哈希值相同时才会判断；
 * 									        因为有的对象要达到相同，所以一般都要根据我们的情况重写hashCode；	
 * 			|--TreeSet：		可以对set集合中的元素进行排序；因为set无序的嘛，所以java机制给set整个可以排序的子类；但是按照什么排呢？
 * 								排序方法一：让元素自身具备比较性，需要元素实现comparable接口，并覆盖compareTo()，集合通过元素自身的比较排除循序；
 * 										        可通过return 0的方式判断元素是否相同，保证元素的唯一性；		
 * 								排序方法二：当元素自身不具备比较性，或者元素自身具备的比较性并不是我们所需要的，这个时候就需要第二种比较方式；
 * 										        直接让集合自身具备；让容器一初始化就具备比较性；
 * 	
 * 集合的选择：
 * 		先看是否需要保证唯一，要就找set，如果还需要排序那就TreeSet，不需要就HashSet
 * 		如果不需要保证唯一，  那就找list，如果增删频繁就用LinkedList，不频繁就ArrayList，不晓得是否频繁，就还是ArrayList
 * 
 * 		HashSet比TreeSet使用的多，因为不需要比较排序，比较效率低，它只负责存和取；
 *		一看到低层数据结构，就要想到用Hash；
 *		一看到二叉树什么的，就要想到Tree,要么comparable,要么Comparator，保证唯一性
 * 
 * 	迭代器
 * 		每个容器都有；用来获取集合的元素；
 * 			迭代器iterator这个类就是用来描叙取出的事务
			因为每个容器数据结构不一，取出的方式不一样，所以就统一抽象出一个接口，就是迭代器接口负责取出这种方式，底层如何实现不管；
 * 		迭代器通俗理解：	
 * 			投币取礼品的游戏机，透明箱子就是容器，里面的毛绒玩具就是一个个对象，夹取礼物的夹子就是容器里面的一个内部类，就是迭代器，它的行为就是取出对象；
 * 			我们不用管夹子在里面是如何生成，如何取出东西的，我们只需要容器给了我们这个迭代器对象，取出我们的礼物就行了；
 * 
 * 	二叉树数据结构：
 * 		一个数A，B比A小，b放到a的左下方；来个d,比a大，放到右下角；来个c，如果比a也小，就跟b比较，小就放到左下方，大就放到右下方，在纸上这么一划你就差不多明白了；
 *
 * */
public class A01_Collection总结 {

}