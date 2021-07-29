select OrderNumber, SKU, (Quantity * Price) as EP 
from ORDER_ITEM
order by OrderNumber, SKU;