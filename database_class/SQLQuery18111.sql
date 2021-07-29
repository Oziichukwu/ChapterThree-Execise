select * 
from RETAIL_ORDER join ORDER_ITEM
on RETAIL_ORDER.ordernumber = ORDER_ITEM.OrderNumber
where OrderYear = 2017
order by RETAIL_ORDER.OrderNumber, ORDER_ITEM.SKU