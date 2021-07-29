



Select OrderNumber,SKU, ExtendedPrice, Quantity, Price
from ORDER_ITEM
where(Quantity * Price) = ExtendedPrice
ORDER BY OrderNumber, SKU