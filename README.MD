
tasking 1
given SmallLocker， when 存包，then 存包成功，返回 ticket

tasking 2 
given SmallLocker ticket，when 取包，then 取包成功

tasking 3
given MiddleLocker，when 存包，then 存包成功，返回 ticket

tasking 4
given MiddleLocker，when 取包，then 取包成功

tasking 5
given PrimaryLockerRobot  MiddleLocker，when PrimaryLockerRobot 存包，then 存包成功，返回 ticket

tasking 6
given PrimaryLockerRobot ticket， when 取包，then 取包成功