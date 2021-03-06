# Java-50
使用Java编写的，涉及到一些基础知识的50题

#### 【程序1】

**题目：**古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一兔子，假如兔子都不死，问每个月的兔子对数为多少？

**程序分析：**

- 兔子的规律为数列1,1,2,3,5,8,13,21....
- 做这种题目，最好的做法就是找出规律，跟高中的数列一样
- 本题有：a[n]=a[n-1]+a[n-1],而第一第二项都知道了，后面的值也可以求得

#### 【程序2】

**题目：**判断101-200之间有多少个素数，并输出所有素数。

**程序分析：**

- 素数是：只能被1或本身整除的数，如：3,5,7,11,131... 
- 判断素数的方法：用一个数分别去除2到sqrt(这个数)，其实用这个数分别去除2到他本身少1的数也可以，但是运算时间增加了
- 如果能被整除，则表明此数不是素数，反之是素数。

#### 【程序3】

**题目：**打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
**程序分析：**

​	利用for循环控制100-999个数，每个数分解出个位，十位，百位。

#### 【程序4】

**题目：**将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。

**程序分析：**对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成：

- 如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。
- 如果n<>k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数n,重复执行第一步。
- 如果n不能被k整除，则用k+1作为k的值,重复执行第一步。

#### 【程序5】

**题目：**利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。

**程序分析：**(a>b)?a:b这是条件运算符的基本例子。

#### 【程序6】

**题目：**输入两个正整数m和n，求其最大公约数和最小公倍数。

**程序分析：**利用辗除法。这里有一个知识点要记住的，最大公约数和最小公倍数的求法

1. 先求最大公约数bigDivisor
2. 就可以很方便获得最小公倍数multiple=input1*input2/bigDIvisor

这里最重要的就是求最大公约数：

- 用大的数对小的数求余
- 把小的数赋值给大的数，把求余获得的结果赋值给小的数，
- 循环上一步的操作，直到求余的结果为零
- 上一步被求余的数就是我们要的最大公约数

#### 【程序7】

**题目：**输入一行字符，分别统计出其英文字母、空格、数字和其它字符的个数。

**程序分析：**这里的需要的知识点:

- 获取一行字符串，nextLine（）

- 把字符串的每一个字符赋值到一个数值中

- 对比每一个数值在ASK码的范围，就可以确定它符号的类别

- char字符ASK码的范围

  ​        （1）数字0到9： 48~57
  ​        （2）字母A到Z：65到90 a到z：97到122
  ​        （3）空格是32 

#### 【程序8】

**题目：**求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。输出结果的形式如：2+22+222=246；

**程序分析：**关键是计算出每一项的值。比如获取的数字为：a，出现的项数为：n

总结一下，可以得到一下规律：

1.  第一项有一个a,最后一项有n个a
2. 第1和第2项相差2*10，第2和第三项相差2*100，第k和第k+1项相差2*（10的k次方）

#### 【程序9】

**题目：**一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3.编程找出1000以内的所有完数。判断完数的方法：

      *  利用for循环判断所有因数的和是否和输入的值是否相等，相等的话输出

      *  求因数的方法：

           ​	两个嵌套循环，并用i%j==0,关于i和j的值范围：i从1到1000逐个遍历，j只需不大于i/2+1即可
            比如：48，最大的因数才24,99最大的因数是33，因数不会大于本身数的一半

           ​	j就是我们所求的因数，把所有的j相加，就可以得到因数总和
           ​	因数总和已经包含1了，因为第一次就保存1了

#### 【程序10】

**题目：**一球从h米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第n次落地时，共经过多少米？第n次反弹多高？
**程序分析：**反弹的高度:(1/2)的n次方*h

经过的距离：这个可以总结得到：第一次落地经过：h,第二次落地经过：h+(h/2)*2,

第三次落地经过：h+(h/2)*2+(h/2/2)*2 

那么第n次落地经过：  h+(h/2)*2+(h/2/2)*2 +...+h/(2的n-1次方)*2

#### 【程序11】

**题目：**有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
**程序分析：**可填在百位、十位、个位的数字都是1、2、3、4。这里要用3个for循环。用if判断条件是否符合，符合条件的数字打印出来,并计算个数总和

#### 【程序12】

**题目：**企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；20万到40万之间时，高于20万元的部分，可提成5%；40万到60万之间时高于40万元的部分，可提成3%；60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润I，求应发放奖金总数？
**程序分析：**请利用数轴来分界，定位。注意定义时需把奖金定义成长整型。

超过   10万    20万       40万        60万          100万          

​           10*0.1  10*0.075   20*0.05    20*0.03     40*0.015      0.01

​                1     1.75         2.75     3.35           3.95    

#### 【程序13】

**题目：**一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？

**程序分析：**在10万以内判断，用for循环判断：先将该数加上100后再开方，再将该数加上268后再开方，如果开方后的结果再平方后分别和i+100,i+268相等，即是结果。

#### 【程序14】

**题目：**输入某年某月某日，判断这一天是这一年的第几天？

**程序分析：**以3月5日为例，应该先把前两个月的加起来，然后再加上5天即本年的第几天，特殊情况，闰年且输入月份大于3时需考虑多加一天。闰年的条件：year除以400能整除，或者year除以4能整除，但是不能是100的倍数

#### 【程序15】

**题目：**输入三个整数x,y,z，请把这三个数由小到大输出。

**程序分析：**我们想办法把最小的数放到x上，先将x与y进行比较，如果x>y则将x与y的值进行交换，然后再用x与z进行比较，如果x>z则将x与z的值进行交换，这样能使x最小。最后两个数也使z>y就可以了 

#### 【程序16】

**题目：**输出$9*9$口诀。

**程序分析：**分行与列考虑，共9行9列，i控制行，jC列。表达式：  $i+"*"+j+"="+i*j$，这里要用两个for循环控制输出和换行

#### 【程序17】

**题目：**猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个第二天早上又将剩下的桃子吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下的一半零一个。到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。

**程序分析：**采取逆向思维的方法，从后往前推断。

天  数     1    2    3    4   5    。。。10

桃子数     1    4   10   22   46          ？

      *   所以桃子数计算方法：$前一天桃子数*2+2$

#### 【程序18】

**题目：**两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。已抽签决定比赛名单。有人向队员打听比赛的名单。a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单。

**程序分析：**这里重要的是使用赋值，还有充分使用给出的条件，还有一个就是互不冲突的常识，比如第一个if的使用！

#### 【程序19】

**题目：**打印出如下图案（菱形）

```
    *
   ***
  *****
 *******
  *****
   ***
    *
```

**程序分析：**先把图形分成两部分来看待，前四行一个规律，后三行一个规律，利用双重 for循环，第一层控制行，第二层控制列。详细分析第一部分图形的规律：

1、这是一个等腰三角形，*的打印次数1、3、5、7等差数列

2、还要注意空格打印的 次数3、2、1、0逐渐递减

第二部分同理可得！ 

#### 【程序20】

**题目：**有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。

**程序分析：**请抓住分子与分母的变化规律。分数：fraction
​       1、第一项是2/1
​       2、前面一项分子和分母相加的和，为下一项的分子
​       3、前面一项分子，为下一项的分母  

#### 【程序21】

**题目：**求1+2!+3!+...+20!的和

**程序分析：**此程序只是把累加变成了累乘。
​         1、先求该项阶乘的值
​         2、累加求求

#### 【程序22】

**题目：**利用递归方法求5!。

**程序分析：**递归公式：f(n)=n*f(n-1)，不断的调用方法，直到最小的值确定

#### 【程序23】

**题目：**有5个人坐在一起，问第五个人多少岁？他说比第4个人大2岁。问第4个人岁数，他说比第3个人大2岁。问第三个人，又说比第2人大两岁。问第2个人，说比第一个人大两岁。最后问第一个人，他说是10岁。请问第五个人多大？

**程序分析：**利用递归的方法，递归分为回推和递推两个阶段。要想知道第五个人岁数，需知道第四人的岁数，依次类推，推到第一人（10岁），再往回推。

#### 【程序24】

**题目：**给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。

**程序分析：**创建一个五位数数的数组，把输入数字的每位数的值赋值到数组里面。把输入数字从个位起获取，并且每获取一次之后/10，这样就能分别获取十位百位千位了。把数字打印出来就是题目所求了 

#### 【程序25】

**题目：**一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。这个程序跟上一个程序类似。

- 创建一个五位数的数组 
- 逐次取位 
- 组后判断条件就可以了 

#### 【程序26】

**题目：**请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续判断第二个字母。

**程序分析：**用情况语句比较好，如果第一个字母一样，则判断用情况语句或if语句判断第二个字母。

#### 【程序27】

**题目：**求100之内的素数

**素数的判断方法：**这个数除以2到比它本身少1的数都不能整除，那么这个数就是素数了！ 

#### 【程序28】

**题目：**对10个数进行排序

**程序分析：**可以利用选择法，即从后9个比较过程中，选择一个最小的与第一个元素交换，下次类推，即用第二个元素与后8个进行比较，并进行交换。最后打印出来的数组就是从小到大排列的数组了

#### 【程序29】

**题目：**求一个3*3矩阵对角线元素之和

**程序分析：**利用双重for循环控制输入二维数组，再将a[i][i]累加后输出。

#### 【程序30】

**题目：**有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。

**程序分析：**首先判断此数是否大于最后一个数，然后再考虑插入中间的数的情况，插入后此元素之后的数，依次后移一个位置。

- 创建两个数组，如果插入的数字比数组最后一个都大，那么插入的数放在新数组最后就可以
- 如果插入的不是最大，那么和数组前面的数逐一比较，比较到比插入的数大就break

- 比如第i个符合条件，那么arrB[i-1]=arrA[i-1],arrB[i]=num,arrB[i+1]=arrA[i]

#### 【程序31】

**题目：**将一个数组逆序输出。

**程序分析：**用第一个与最后一个交换。

#### 【程序32】

**题目：**取一个整数a从右端开始的4～7位

详细分析在程序中

#### 【程序33】

**题目：**打印出杨辉三角形（要求打印出10行如下图）

```
      1
     1 1
    1 2 1
   1 3 3 1
  1 4 6 4 1
1 5 10 10 5 1
```

**程序分析：**

- 二维数组的使用
- 第一列的数都是1
- 用两个for循环，i控制行，j控制列；

从第二行第二列起$arr[i][j]=arr[i-1][j-1]+arr[i-1][j]​$

#### 【程序34】

**题目：**输入3个数a,b,c，按大小顺序输出。

**程序分析：**利用指针方法。

#### 【程序35】

**题目：**输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。

**程序分析：**

- 找到该数组的最大值和最小值
- 找到该数组最大项把它和第一位交换，
- 找到该数值的最小项把它和最后一项交换
- 这里有一点值得注意：不能把最大值和最小值先找出来，再连续执行两次操作交换，会出错！

#### 【程序36】

**题目：**有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数

**程序分析：**在原来数组的基础上还要创建一个和原来数组大小一样的数组，根据要移动的位数把原来的数组分割成两个部分分别赋值给新的数组。

#### 【程序37】

**题目：**有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来第几号的那位。关键问题是怎么移除？:布尔值确定，如果被选中被赋值为false

- 从第一个人开始判断，如果他在圈内，那么报数，再判断他报的数是否是3，如果是的话移出圈外

- 接着判断下一个人，是否到了最末，如果是的话，从零开始
- 不断循环，直到最后剩下1个人

#### 【程序38】

**题目：**写一个函数，求一个字符串的长度，在main函数中输入字符串，并输出其长度。

#### 【程序39】

**题目：**编写一个函数，输入n为偶数时，调用函数求`1/2+1/4+...+1/n`,当输入n为奇数时，调用函数$1/1+1/3+...+1/n$(利用指针函数)
**程序分析：**

1、先判断是奇数还是偶数

2、分数分子都是一，偶数分母从2开始，奇数的分母从1开始，分母差值都为2

#### 【程序40】

**题目：**字符串排序。

#### 【程序41】

**题目：**海滩上有一堆桃子，五只猴子来分。第一只猴子把这堆桃子凭据分为五份，多了一个，这只猴子把多的一个扔入海中，拿走了一份。第二只猴子把剩下的桃子又平均分成五份，又多了一个，它同样把多的一个扔入海中，拿走了一份，第三、第四、第五只猴子都是这样做的，问海滩上原来最少有多少个桃子？

**程序分析：**这其实就是一个递归问题每次*5 +1，用逆向思维。

```
            5      4      3     2      1     
桃子个数     6     31    156   781     3906
猴子拿的个数  1      6    31    156     781
```

#### 【程序42】

**题目：**$809*??=800*??+9*??+1$
其中??代表的两位数,8*??的结果为两位数，9*??的结果为3位数。求??代表的两位数，及809*??后的结果。

**程序解析：**for循环的使用 

#### 【程序43】

**题目：**求0—7所能组成的奇数个数。

**程序分析：**最少也是1位数，最多能组成8位的数字 

 *       第一位不能为零，最后一位不能是偶数
 *       0到7有四个奇数
 *       这里用累加求和

#### 【程序44】

**题目：**一个偶数总能表示为两个素数之和。

**程序分析：**判断两个加数是不是素数

#### 【程序45】

**题目：**判断一个素数能被几个9整除

#### 【程序46】

**题目：**两个字符串连接程序

#### 【程序47】

**题目：**读取7个数（1—50）的整数值，每读取一个值，程序打印出该值个数的＊。

#### 【程序48】

**题目：**某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，加密规则如下：每位数字都加上5,然后用和除以10的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换。

**程序分析：**

1、数字取位，个十百千位分别求出

2、按要求替换

3、按要求交换

#### 【程序49】

**题目：**计算字符串中子串出现的次数

**程序分析：**把string类型的字符串的每个元素，转换为char数组里面的每个数组的值string.toCharArray()。判断char数组中是否存在空格，存在的话子字符串数量加1

#### 【程序50】

**题目：**有五个学生，每个学生有3门课的成绩，从键盘输入以上数据（包括学生号，姓名，三门课成绩），计算出平均成绩，将原有的数据和计算出的平均分数存放在磁盘文件"stud"中。

这题涉及文件存储，输入输出流。