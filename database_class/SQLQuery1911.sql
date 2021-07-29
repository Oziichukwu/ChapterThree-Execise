select * 
from RETAIL_ORDER join ORDER_ITEM
on RETAIL_ORDER.ordernumber = ORDER_ITEM.OrderNumber
order by RETAIL_ORDER.OrderNumber, ORDER_ITEM.SKU