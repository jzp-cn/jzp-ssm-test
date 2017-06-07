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
-------------------------------------------
