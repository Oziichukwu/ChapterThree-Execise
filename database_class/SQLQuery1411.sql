select Retail_order.OrderNumber, sku, storenumber, price, quantity
from RETAIL_ORDER,ORDER_ITEM
where RETAIL_ORDER.OrderNumber = ORDER_ITEM.OrderNumber order by 
RETAIL_ORDER.OrderNumber, ORDER_ITEM, sku;