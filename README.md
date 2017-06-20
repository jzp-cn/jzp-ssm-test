# jzp-ssm-test

creata time 2017-06-06  
notice: create the hole project 1.0 , and run it .


update by:

------------------------------------------
##2016-06-07 update by jzp

2017-06-07 $ git push fatal: Not a git repository (or any of the parent directories): .git
  --> git init 解决

fatal: The current branch master has no upstream branch.
To push the current branch and set the remote as upstream, use

    git push --set-upstream https://github.com/jzp-cn/jzp-ssm-test.git master

操作步骤
1.git init 初始化git仓库

2.git clone 从远程把仓库复制下来（pull 还没学会）

3.git branch jzp (新建了一个名叫jzp的本地分支)

4.git checkout jzp(从master 切换分支过去)

4.5  。。。。（本地修改代码）

5.git add .  (添加至缓存)

6.git commit (提交到本地代码到本地的git分支的代码中)

7.git checkout master  （切换回本地的master仓库）

8.git merge jzp (把jzp 合并到master之中)

9.git add . (我感觉不需要的操作)

10.git commit(同上)

11.git push




git 本地仓库中 如果在分支上修改了 没有提交  master也会发生变化  好神奇

貌似如果不是采用git commit -m "xxx"   而采用 git commit 之后再用git push 的话 推不上去？

test  //测试通过了   就是如果不添加注释 直接commit的话  就推不上去  好神奇

--------------------------------------------------------------------------------------
##2017-06-08  update by jzp

采用了不知道哪的思维 

原来就是一个普通的项目

现在我把它拆成了三个不同的项目，分为了 dao,service,dao,pojo，然后用一个父类把他们几个包起来叫 manager,最后用一个parent把manager包起来，将来会做成

一个和manager的同级方法commons,包结构如下：

--parent

 --commons(还没写)
 
 --manager
 
	--pojo
	
	--dao
	
	--service
	
	--web
	
最后发现存在乱码问题，明天解决吧

-------------------------------------------------------------
##2017-06-09  update by jzp

昨天晚上一直没有提交成功  现在才用git提交成功  
今天是重新充git上clone 一份然后把新的覆盖掉旧的才提交成功的 
具体怎么失败还没弄明白
还有就是 我是在\jzp\jzp-ssm-test后边还有一个jzp-ssm-test  感觉目录有问题


仿照taotao商城就行修改

里头用了它的数据库

我把taotao 修改成jzp，然后他的po类的名称就是po，我看到不舒服，改成了pojo，然后集体替换的时候有个字段叫sell_point，替换成了sell_pojoint，一路修改

最终成功

并没有成功。。。  我不小心直接在本地的master上修改，这就算了 ，我还想在项目里头新建一个README.md 做笔记，没想到就被狙击  

为啥不能再目录里头有README.db????????????????*******************************


-------------------------------------------------------
##2017-06-10  update by jzp

可以说是我花了两天时间把dubbo 搭起来了

犯错无数 

思路：把web层给抽出来作为dubbo的consumer，service抽出来作为dubbo的provider

迷惑：不知道为什么要把service作为war包，感觉没必要。还有中间我开始没有把interface单独作为一个项目抽出来，启动失败了，不懂为什么不行

参考：http://blog.csdn.net/congcong68/article/details/41113239

虽然我是在window上搭建的，原理一致


ps:知道怎么md文件的一丢丢操作了了，如果在--前边不留一行的话 字体会变大  好神奇

-------------------------------------------------------------------------------
##2017-06-12 update by jzp

知道了@value 注解怎么用

在controller 中 
	
	@Value("${db.username}")
	private String username;

在springmvc.xml中

	<bean id="configProperties" class="org.springframework.beans.factory.config.PropertyPlaceholderConfigurer">
        <property name="ignoreResourceNotFound" value="true"/>
        <property name="locations">
			<list>
                <value>classpath*:db.properties</value>
            </list>
        </property>
    </bean

就可以直接读取配置文件的信息
	

#Q：怎么读取到JZP-MANAGER-DAO中的PROPERTIES中的文件 

我读取不到，我只能读取到同一个目录下的属性文件

-----------------------------------------------------------------------
2017-06-16 update by jzp

中间不知道啥的出了点小意外，外边那个也是这个项目，反正最后我在这几天把麻溜的切换dev,test,prepare-Test环境的设置弄好了

这是在jzp-parent.pom里头的

	<profiles>
    <!-- 开发环境  -->
    <profile>
      <id>dev</id>
      <properties>
        <env>dev</env>
        <maven.test.skip>true</maven.test.skip>
      </properties>
      <!-- 设置默认环境 -->
      <activation>
        <activeByDefault>true</activeByDefault>
      </activation>
    </profile>
    <!-- 测试环境  -->
    <profile>
      <id>test</id>
      <properties>
        <env>test</env>
      </properties>
    </profile>
    <!-- 线上环境 -->
    <profile>
      <id>main</id>
      <properties>
        <!-- 部署环境(对应配置文件版本) -->
        <env>main</env>
      </properties>
    </profile>

    <!-- 233环境  预上线环境 -->
    <profile>
      <id>pre</id>
      <properties>
        <!-- 部署环境(对应配置文件版本) -->
        <env>pre</env>
      </properties>
    </profile>
    <!-- 233环境  测试 -->
    <profile>
      <id>prepare-test</id>
      <properties>
        <!-- 部署环境(对应配置文件版本) -->
        <env>prepare-test</env>
      </properties>
    </profile>
  </profiles>


jzp-manager-dao  这里读取的是配置文件的文件

          <!-- 先指定 src/test 下所有文件及文件夹为资源文件 -->
            <resource>
                <directory>src/dev</directory>
                <targetPath>${project.build.directory}/classes</targetPath>
                <includes>
                    <include>**/*</include>
                </includes>
                <filtering>true</filtering>
            </resource>
            <!-- 根据env部署环境值，把对应环境的配置文件拷贝到classes目录 -->
            <resource>
                <directory>src/${env}</directory>
                <targetPath>${project.build.directory}/classes</targetPath>
                <filtering>true</filtering>
            </resource>


jzp-commons -->config

	    <build>
        <resources>
            <!-- 先指定 src/test 下所有文件及文件夹为资源文件 -->
            <resource>
                <directory>../jzp-commons/config/src/dev</directory>
                <targetPath>${project.build.directory}/classes</targetPath>
                <includes>
                    <include>**/*</include>
                </includes>
                <filtering>true</filtering>
            </resource>
            <!-- 根据env部署环境值，把对应环境的配置文件拷贝到classes目录 -->
            <resource>
                <directory>src/${env}</directory>
                <targetPath>${project.build.directory}/classes</targetPath>
                <filtering>true</filtering>
            </resource>
       	</resources>
    	</build>

过会测试一下  上头这两个感觉重复了

最后再把三套不同的配置文件放入commons--->config中就行了



晚上有空就把读写分离和事务的这里写一下

-----------------------------------------------------------

2017-06-20 update by jzp

这几天没空写这个了，我记录一下我再帮笑天童鞋处理领取优惠券的情况：

需求：现在有1w张优惠券，用户输入手机号码给用户一张

思路：把1w优惠券放入redis中，用list存入，每有一个号码进来，就调用Long number = redis.incr()，获取到唯一递增的序列（这个方法能保证原子性线程安全，incr（）会自增） 。 然后调用lpop方法，这个方法能把列表的数据一个一个排出去，这样就一个手机有了一个优惠券， 最后把数据写入到数据库中。











