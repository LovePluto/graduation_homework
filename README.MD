
tasking 1  
given: SmallLocker  
when: 存包  
then: 存包成功，返回 ticket  

tasking 2   
given: SmallLocker ticket  
when: 取包  
then: 取包成功  

tasking 3  
given: MiddleLocker  
when: 存包  
then: 存包成功, 返回 ticket  

tasking 4  
given: MiddleLocker  
when 取包  
then 取包成功  

tasking 5  
given: PrimaryLockerRobot  MiddleLocker  
when: PrimaryLockerRobot 存包  
then: 存包成功,返回 ticket  

tasking 6  
given: PrimaryLockerRobot ticket  
when: 取包  
then: 取包成功  

tasking 7  
given: PrimaryLoc kerRobot 第一个 MiddleLocker 存满, 第二个 MiddleLocker 有位置  
when: 存包  
then: 存入第二个 MiddleLocker 成功, 返回 ticket  

tasking 8  
given: LargeLocker  
when: 存包  
then 存包成功, 返回 ticket  

tasking 9  
given: LargeLocker ticket  
when: 取包  
then: 取包成功  

tasing 10
given: SupperLockerRobot, bag  
when: 存包
then： 存包空置率最大的 locker, ticket

tasking 11  
given: SupperLockerRobot ticket  
when: 取包  
then: 取包成功  

tasking 12   
given: LockerRobotManager   
when: 存包   
then: 存包成功   

tasking 13
given: LockerRobotManager ticket
when: 取包
then: 取包成功

tasking 14   
given: SmallLocker, 不是 SmallerLocker 产生的 ticket   
when: 取包   
then: 提示 ticket 类型错误   

tasking 15    
given: MiddleLocker, 不是 MiddleLocker 产生的 ticket   
when: 取包   
then: 提示 ticket 类型错误   

tasking 16   
given: LargeLocker, 不是 LargeLocker 产生的 ticket     
when: 取包   
then: 提示 ticket 类型错误   

tashing 17
given: 存满的 locker
when: 存包
then: 提示 locker 已经存满







