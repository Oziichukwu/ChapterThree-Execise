use cape_codd

select * from ORDER_ITEM

select SUM(ExtendedPrice) AS WaterSportsRevenue
FROM ORDER_ITEM
WHERE SKU IN (SELECT SKU
from SKU_DATA
WHERE Department = 'water sports');