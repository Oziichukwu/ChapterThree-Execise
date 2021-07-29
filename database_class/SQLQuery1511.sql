select * 
from RETAIL_ORDER,ORDER_ITEM
where RETAIL_ORDER.OrderNumber = ORDER_ITEM.OrderNumber order by 
RETAIL_ORDER.OrderNumber, ORDER_ITEM.SKU;