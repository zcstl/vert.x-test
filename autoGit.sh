#!/bin/sh
commitMsg=$1
#git remote add origin https://github.com/zcstl/leetcode.git
git add *
if [ $commitMsg'x' == 'x' ];then
   echo git commit -m "auto commit"
   git commit -m "auto commit"
else
   echo git commit -m $commitMsg
   git commit -m $commitMsg
fi
#git push -u origin master
git push 
