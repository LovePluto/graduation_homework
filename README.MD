
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





