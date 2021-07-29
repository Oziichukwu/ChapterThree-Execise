-- CLASSWORK --

select * from RETAIL_ORDER;



SELECT SUM(Price) AS orderItemsum, 
round(AVG (Price), 0) AS orderItemAvg,
MIN(Price) AS orderItemMin,
MAX(Price) AS orderItemMax
FROM ORDER_ITEM;	

SELECT SUM(OrderTotal) AS orderItemsum, 
round (AVG(OrderTotal),0) AS orderItemAvg,
MIN(OrderTotal) AS orderItemMin,
MAX(OrderTotal) AS orderItemMax
from RETAIL_ORDER
where OrderYear = 2017;




