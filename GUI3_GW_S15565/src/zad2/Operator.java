package zad2;

import java.math.BigDecimal;

public interface Operator // it's functional interface (has only one method).
{
	BigDecimal operation(BigDecimal a, BigDecimal b);
}
