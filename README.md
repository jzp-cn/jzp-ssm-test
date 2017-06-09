# jzp-ssm-test

creata time 2017-06-06
notice: create the hole project , and run it .


update by:

------------------------------------------
2016-06-07 update by jzp

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
 
貌似如果不是采用git commit -m "xxx"   而采用 git commit 之后再用git push 的话 推不上去？ 
test  //测试通过了   就是如果不添加注释 直接commit的话  就推不上去  好神奇
--------------------------------------------------------------------------------------
2017-06-08  update by jzp

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
2017-06-09  update by jzp

昨天晚上一直没有提交成功  现在才用git提交成功  
今天是重新充git上clone 一份然后把新的覆盖掉旧的才提交成功的 
具体怎么失败还没弄明白
还有就是 我是在\jzp\jzp-ssm-test后边还有一个jzp-ssm-test  感觉目录有问题


仿照taotao商城就行修改

里头用了它的数据库

我把taotao 修改成jzp，然后他的po类的名称就是po，我看到不舒服，改成了pojo，然后集体替换的时候有个字段叫sell_point，替换成了sell_pojoint，一路修改

最终成功






















