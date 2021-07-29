-- using sql built-in aggregate functions: sum, avg, min, and max --

SELECT SUM(EXTENDEDPRICE) AS orderItemsum, 
AVG(ExtendedPrice) AS orderItemAvg,
MIN(ExtendedPrice) AS orderItemMin,
MAX(ExtendedPrice) AS orderItemMax
FROM ORDER_ITEM;